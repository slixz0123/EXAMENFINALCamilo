package com.camilov.prueba.repository;

import com.camilov.prueba.entity.Carrera;
import com.camilov.prueba.entity.Ciclo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICarreraRepository  extends MongoRepository<Carrera,Long> {
}
