package com.camilov.prueba.controller;


import com.camilov.prueba.entity.Profesor;

import com.camilov.prueba.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/controller")
public class ProfesorController {


    @Autowired
    IProfesorService asigService;

    @GetMapping("/listar")
    public ResponseEntity<List<Profesor>> listarprof() {
        return new ResponseEntity<>(asigService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Profesor> crearprof(@RequestBody Profesor a) {
        return new ResponseEntity<>(asigService.save(a), HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Profesor> actualizardpt(@PathVariable Long id, @RequestBody Profesor a) {
        Profesor asigencontrado = asigService.findById(id);
        if (asigencontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                asigencontrado.setNombre(a.getNombre());
                asigencontrado.setApellido(a.getApellido());
                asigencontrado.setCelular(a.getCelular());
                asigencontrado.setCorreo(a.getCorreo());
                asigencontrado.setDireccion(a.getDireccion());


                return new ResponseEntity<>(asigService.save(a), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Profesor> eliminarprof(@PathVariable Long id) {
        asigService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
