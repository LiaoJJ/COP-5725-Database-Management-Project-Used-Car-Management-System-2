package com.dbms.boot.domain;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
public class Review {
    @Id
    private BigDecimal REVIEW_ID;
    private String REVIEW;
    private Timestamp DATE;
    private String WRITTEN_BY;
    private BigDecimal TO_LISTING;
}
