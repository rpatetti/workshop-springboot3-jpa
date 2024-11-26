package com.patettirafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patettirafael.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
