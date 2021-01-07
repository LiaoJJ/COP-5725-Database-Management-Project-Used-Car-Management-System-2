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

    @Query(nativeQuery = true, value = "select DISTINCT designed_by  FROM CARMODEL ORDER BY designed_by;")
    List<String> manufacturerList();

    @Query(nativeQuery = true, value = "select DISTINCT fuel  FROM CARMODEL ORDER BY fuel;")
    List<String> fuelList();
}
