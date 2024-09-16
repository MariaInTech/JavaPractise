package com.example.assignementproject.repository;

import com.example.assignementproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.age = ?1")
    List<User> findByAge(Integer age);
}