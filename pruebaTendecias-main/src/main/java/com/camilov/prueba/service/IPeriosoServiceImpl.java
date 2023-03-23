package com.camilov.prueba.service;

import com.camilov.prueba.entity.Asignatura;
import com.camilov.prueba.entity.Periodo;
import com.camilov.prueba.repository.IAsignaturaRepository;
import com.camilov.prueba.repository.IPeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public class IPeriosoServiceImpl  extends GenericServiceImpl<Periodo,Long>implements IPeriodoService{
    @Autowired
    IPeriodoRepository periodoRepository;
    @Override
    public CrudRepository<Periodo, Long> getDao() {
        return periodoRepository;
    }
}
