package com.dbms.boot.repository;

import com.dbms.boot.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;

public interface UserRepository extends JpaRepository<Users, String>{
    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM USERS")
    BigDecimal countUsers();
}
