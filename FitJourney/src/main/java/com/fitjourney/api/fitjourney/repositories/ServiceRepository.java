package com.fitjourney.api.fitjourney.repositories;

import com.fitjourney.api.fitjourney.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
