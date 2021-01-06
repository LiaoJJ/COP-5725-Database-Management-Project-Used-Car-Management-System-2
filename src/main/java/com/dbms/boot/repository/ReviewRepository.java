package com.dbms.boot.repository;

import com.dbms.boot.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;


public interface ReviewRepository extends JpaRepository<Review, BigDecimal>{
    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM Review")
    BigDecimal countReview();
}
