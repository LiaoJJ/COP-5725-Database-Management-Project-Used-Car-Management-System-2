package com.dbms.boot.repository;

import com.dbms.boot.domain.Location;
import com.dbms.boot.domain.LocationUPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;

public interface LocationRepository extends JpaRepository<Location, LocationUPK>{
    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM Location")
    BigDecimal countLocation();
}
