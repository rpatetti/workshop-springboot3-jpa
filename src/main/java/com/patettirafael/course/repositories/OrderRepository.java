package com.patettirafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patettirafael.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
