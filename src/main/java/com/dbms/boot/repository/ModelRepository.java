package com.dbms.boot.repository;

import com.dbms.boot.domain.Carmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;

public interface ModelRepository extends JpaRepository<Carmodel, String>{
    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM CARMODEL")
    BigDecimal countModel();
}
