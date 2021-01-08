package com.dbms.boot.repository;

import com.dbms.boot.domain.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.math.BigDecimal;

public interface ListingRepository extends JpaRepository<Listing, BigDecimal>{
    @Query(nativeQuery = true, value = "SELECT COUNT(*) FROM LISTING")
    BigDecimal countListing();

}
