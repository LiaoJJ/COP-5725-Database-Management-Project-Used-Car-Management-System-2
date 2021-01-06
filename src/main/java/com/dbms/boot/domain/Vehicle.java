package com.dbms.boot.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
public class Vehicle {
    @Id
    private String VEHICLE_ID;
    private BigDecimal PRICE;
    private String COLOR;
    private BigDecimal ODOMETER;
    private String TITLE_STATUS;

    @Column(name = "`condition`")
    private String CONDITION;
    private String REGION;
    private String STATE;
    private String MODEL;
}
