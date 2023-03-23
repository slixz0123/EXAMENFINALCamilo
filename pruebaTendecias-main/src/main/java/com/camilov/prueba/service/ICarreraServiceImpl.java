package com.camilov.prueba.service;

import com.camilov.prueba.entity.Asignatura;
import com.camilov.prueba.entity.Carrera;
import com.camilov.prueba.repository.IAsignaturaRepository;
import com.camilov.prueba.repository.ICarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ICarreraServiceImpl extends GenericServiceImpl<Carrera,Long> implements IcarreraService {
    @Autowired
    ICarreraRepository carreraReposito;
    @Override
    public CrudRepository<Carrera, Long> getDao() {
        return carreraReposito;
    }
}
