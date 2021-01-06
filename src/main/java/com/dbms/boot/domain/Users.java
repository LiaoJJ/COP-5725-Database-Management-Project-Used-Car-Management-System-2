package com.dbms.boot.domain;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Users {
    @Id
    private String USERNAME;

    @NotNull
    private String PASSWORD;
}
