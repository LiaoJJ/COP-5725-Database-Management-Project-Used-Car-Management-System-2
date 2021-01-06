package com.dbms.boot.domain;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Listing {
    @Id
    private BigDecimal ENTRY_ID;
    private String CARID;
    private Integer YEAR;
    private BigDecimal ORDERED_BY;
}
