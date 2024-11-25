package com.patettirafael.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patettirafael.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
