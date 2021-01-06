package com.dbms.boot.domain;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Carmodel {
    @Id
    private String MODEL_NAME;
    private String NUMBER_OF_CYLINDER;
    private String TYPE_OF_DRIVE;
    private String CAR_TYPE;
    private String TRANSMISSION;
    private String CAR_SIZE;
    private String FUEL;
    private String DESIGNED_BY;
}
