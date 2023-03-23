package com.camilov.prueba.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "carrera")
@Data
public class Carrera {
    @Id
    private Long carre_ID;

    private String nombre;
    private String descripion;

}
