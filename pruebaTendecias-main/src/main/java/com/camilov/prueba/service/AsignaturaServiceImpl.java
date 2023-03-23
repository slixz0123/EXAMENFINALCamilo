package com.camilov.prueba.service;

import com.camilov.prueba.entity.Asignatura;
import com.camilov.prueba.repository.IAsignaturaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class AsignaturaServiceImpl extends GenericServiceImpl<Asignatura,Long>implements IAsignaturaService{
    @Autowired
    IAsignaturaRepository asigRepository;
    @Override
    public CrudRepository<Asignatura, Long> getDao() {
        return asigRepository;
    }
}
