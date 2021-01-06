package com.dbms.boot.domain;

import lombok.Data;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@Data
public class Location {
    @EmbeddedId
    private LocationUPK locationUPK;
    private String LATITUDE;
    private String LONGTITUDE;
}
