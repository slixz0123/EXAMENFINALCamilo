package com.camilov.prueba.repository;

import com.camilov.prueba.entity.Ciclo;
import com.camilov.prueba.entity.Periodo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPeriodoRepository extends MongoRepository<Periodo,Long> {
}
