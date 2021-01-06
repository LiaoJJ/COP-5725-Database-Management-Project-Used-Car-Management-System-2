package com.dbms.boot.repository;

import com.dbms.boot.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;

public interface VehicleRepository extends JpaRepository<Vehicle, String>{
    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM VEHICLE")
    BigDecimal countVehicle();
}
