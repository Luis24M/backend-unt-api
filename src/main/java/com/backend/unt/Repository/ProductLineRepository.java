package com.backend.unt.Repository;

import com.backend.unt.Entity.ProductLineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductLineRepository extends JpaRepository<ProductLineEntity,Long> {
}
