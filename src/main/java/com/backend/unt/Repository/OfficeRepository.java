package com.backend.unt.Repository;

import com.backend.unt.Entity.OfficeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepository extends JpaRepository<OfficeEntity, Long> {
}
