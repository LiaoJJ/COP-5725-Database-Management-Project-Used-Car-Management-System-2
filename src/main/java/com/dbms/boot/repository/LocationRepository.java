package com.dbms.boot.repository;

import com.dbms.boot.domain.Location;
import com.dbms.boot.domain.LocationUPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;
import java.util.List;

public interface LocationRepository extends JpaRepository<Location, LocationUPK>{
    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM LOCATION")
    BigDecimal countLocation();


    @Query(nativeQuery = true, value = "select DISTINCT REGION FROM LOCATION WHERE REGION IS NOT NULL ORDER BY REGION;")
    List<String> regionList();

    @Query(nativeQuery = true, value = "select DISTINCT STATE FROM LOCATION  WHERE STATE IS NOT NULL ORDER BY STATE;")
    List<String> stateList();
}
