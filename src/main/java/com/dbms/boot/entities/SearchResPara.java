package com.dbms.boot.entities;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class SearchResPara {
    private BigDecimal LISTING_ID;

    private Integer YEAR;

    private BigDecimal PRICE;

    private String COLOR;

    private BigDecimal ODOMETER;

    private String TITLE_STATUS;

    private String CONDITION;

    private String REGION;

    private String STATE;

    private String MODEL;

    private String DESIGNED_BY;

    public SearchResPara(BigDecimal LISTING_ID, Integer YEAR, BigDecimal PRICE, String COLOR, BigDecimal ODOMETER, String TITLE_STATUS, String CONDITION, String REGION, String STATE, String MODEL, String DESIGNED_BY) {
        this.LISTING_ID = LISTING_ID;
        this.YEAR = YEAR;
        this.PRICE = PRICE;
        this.COLOR = COLOR;
        this.ODOMETER = ODOMETER;
        this.TITLE_STATUS = TITLE_STATUS;
        this.CONDITION = CONDITION;
        this.REGION = REGION;
        this.STATE = STATE;
        this.MODEL = MODEL;
        this.DESIGNED_BY = DESIGNED_BY;
    }
}
