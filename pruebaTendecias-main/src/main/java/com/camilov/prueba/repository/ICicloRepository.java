package com.camilov.prueba.repository;

import com.camilov.prueba.entity.Ciclo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICicloRepository extends MongoRepository<Ciclo,Long> {
}
