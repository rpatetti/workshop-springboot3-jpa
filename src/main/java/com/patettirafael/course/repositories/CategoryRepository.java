package com.patettirafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patettirafael.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
