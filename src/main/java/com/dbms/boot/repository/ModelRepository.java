package com.dbms.boot.repository;

import com.dbms.boot.domain.Carmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<Carmodel, String>{
    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM CARMODEL")
    BigDecimal countModel();

    @Query(nativeQuery = true, value = "select DISTINCT DESIGNED_BY  FROM CARMODEL ORDER BY DESIGNED_BY;")
    List<String> manufacturerList();

    @Query(nativeQuery = true, value = "select DISTINCT FUEL  FROM CARMODEL ORDER BY FUEL;")
    List<String> fuelList();
}
