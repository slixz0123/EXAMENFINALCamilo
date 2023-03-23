package com.camilov.prueba.service;

import com.camilov.prueba.entity.Asignatura;
import com.camilov.prueba.entity.Ciclo;
import com.camilov.prueba.repository.IAsignaturaRepository;
import com.camilov.prueba.repository.ICicloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public class ICicloServiceImpl extends GenericServiceImpl<Ciclo,Long>implements ICicloService{
    @Autowired
    ICicloRepository cicloRepository;
    @Override
    public CrudRepository<Ciclo, Long> getDao() {
        return cicloRepository;
    }
}
