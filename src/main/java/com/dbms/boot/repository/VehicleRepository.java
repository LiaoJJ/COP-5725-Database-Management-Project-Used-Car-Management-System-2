package com.dbms.boot.repository;

import com.dbms.boot.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;
import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, String>{
    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM VEHICLE")
    BigDecimal countVehicle();

    @Query(nativeQuery = true, value = "select DISTINCT `CONDITION`  FROM VEHICLE  WHERE `CONDITION` IS NOT NULL ORDER BY `CONDITION`;")
    List<String> conditionList();

    @Query(nativeQuery = true, value = "select DISTINCT `TITLE_STATUS`  FROM VEHICLE WHERE `TITLE_STATUS` IS NOT NULL ORDER BY `TITLE_STATUS`;")
    List<String> statusList();

    @Query(nativeQuery = true, value = "select DISTINCT COLOR  FROM VEHICLE  ORDER BY COLOR;")
    List<String> colorList();
}
