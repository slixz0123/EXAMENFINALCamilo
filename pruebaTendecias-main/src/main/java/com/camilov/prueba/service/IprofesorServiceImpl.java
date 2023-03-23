package com.camilov.prueba.service;

import com.camilov.prueba.entity.Asignatura;
import com.camilov.prueba.entity.Profesor;
import com.camilov.prueba.repository.IAsignaturaRepository;
import com.camilov.prueba.repository.IPeriodoRepository;
import com.camilov.prueba.repository.IProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class IprofesorServiceImpl  extends GenericServiceImpl<Profesor,Long>implements IProfesorService{
    @Autowired
    IProfesorRepository profeRepository;
    @Override
    public CrudRepository<Profesor, Long> getDao() {
        return profeRepository;
    }
}
