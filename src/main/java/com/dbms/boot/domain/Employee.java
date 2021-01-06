package com.dbms.boot.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Employee {
    @Id
    int id;
    String lastName;
    String email;
    int gender;
    int d_id;
}