package com.camilov.prueba.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "asignatura")
@Data
public class Asignatura {
    @Id
    private Long asig_ID;

    private String nombreasig;
    private int n_horas;
    private int n_horas_practicas;
    private int n_horas_autonomas;

}
