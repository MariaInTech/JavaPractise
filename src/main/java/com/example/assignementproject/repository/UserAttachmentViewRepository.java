package com.example.assignementproject.repository;

import com.example.assignementproject.entities.User;
import com.example.assignementproject.projection.UserAttachmentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserAttachmentViewRepository extends JpaRepository<User,Long> {
    @Query(value = "SELECT * FROM public.user_attachment_view", nativeQuery = true)
    List<UserAttachmentProjection> findAllUserAttachments();
}



