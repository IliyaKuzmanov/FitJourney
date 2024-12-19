package com.fitjourney.api.fitjourney.repositories;

import com.fitjourney.api.fitjourney.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
