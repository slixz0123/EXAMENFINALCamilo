package com.camilov.prueba.repository;


import com.camilov.prueba.entity.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProfesorRepository extends MongoRepository<Profesor,Long> {
}
