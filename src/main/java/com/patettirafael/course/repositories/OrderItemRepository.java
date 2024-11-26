package com.patettirafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patettirafael.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
