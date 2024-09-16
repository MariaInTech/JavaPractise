package com.example.assignementproject.repository;

import com.example.assignementproject.entities.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
    @Query(value = "SELECT * FROM Attachment WHERE userId = :userId", nativeQuery = true)
    List<Attachment> findByUserId(@Param("userId") Long userId);
}
