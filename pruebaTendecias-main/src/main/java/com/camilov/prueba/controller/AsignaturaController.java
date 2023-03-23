package com.camilov.prueba.controller;

import com.camilov.prueba.entity.Asignatura;
import com.camilov.prueba.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asig")
public class AsignaturaController {

    @Autowired
    IAsignaturaService asigService;

    @GetMapping("/listar")
    public ResponseEntity<List<Asignatura>> listarDepto() {
        return new ResponseEntity<>(asigService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Asignatura> crearDepto(@RequestBody Asignatura a) {
        return new ResponseEntity<>(asigService.save(a), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Asignatura> actualizarDepto(@PathVariable Long id, @RequestBody Asignatura a) {
        Asignatura asigencontrado = asigService.findById(id);
        if (asigencontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                asigencontrado.setNombreasig(a.getNombreasig());
                asigencontrado.setN_horas(a.getN_horas());
                asigencontrado.setN_horas_autonomas(a.getN_horas_autonomas());
                asigencontrado.setN_horas_practicas(a.getN_horas_practicas());

                return new ResponseEntity<>(asigService.save(a), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Asignatura> eliminarDepto(@PathVariable Long id) {
        asigService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
