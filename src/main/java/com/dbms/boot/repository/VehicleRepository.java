package com.dbms.boot.repository;

import com.dbms.boot.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;
import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, String>{
    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM VEHICLE")
    BigDecimal countVehicle();

    @Query(nativeQuery = true, value = "select DISTINCT `condition`  FROM VEHICLE ORDER BY `condition`;")
    List<String> conditionList();

    @Query(nativeQuery = true, value = "select DISTINCT `title_status`  FROM VEHICLE ORDER BY `title_status`;")
    List<String> statusList();

    @Query(nativeQuery = true, value = "select DISTINCT color  FROM vehicle  ORDER BY color;")
    List<String> colorList();
}
