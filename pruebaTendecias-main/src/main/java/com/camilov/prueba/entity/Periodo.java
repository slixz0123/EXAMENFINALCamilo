package com.camilov.prueba.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "periodo")
@Data
public class Periodo {
    @Id
    private Long prof_ID;

    private String periodo;
    private int year;

}
