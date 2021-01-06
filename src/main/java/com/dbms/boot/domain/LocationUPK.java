package com.dbms.boot.domain;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@EqualsAndHashCode
public class LocationUPK implements Serializable{
    @Column(name = "REGION", nullable = false, length = 50)
    private String REGION;

    @Column(name = "STATE", nullable = false, length = 50)
    private String STATE;
}
