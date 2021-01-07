package com.dbms.boot.repository;

import com.dbms.boot.domain.Location;
import com.dbms.boot.domain.LocationUPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;
import java.util.List;

public interface LocationRepository extends JpaRepository<Location, LocationUPK>{
    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM Location")
    BigDecimal countLocation();


    @Query(nativeQuery = true, value = "select DISTINCT region FROM location  ORDER BY region;")
    List<String> regionList();

    @Query(nativeQuery = true, value = "select DISTINCT state FROM location ORDER BY state;")
    List<String> stateList();
}
