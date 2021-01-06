package com.dbms.boot.repository;

import com.dbms.boot.domain.Employee;
import com.dbms.boot.domain.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface TestRepository extends JpaRepository<Employee, Integer>{
    @Query(nativeQuery = true, value = "SELECT * FROM Employee")
    List<Employee> countListing();
}

