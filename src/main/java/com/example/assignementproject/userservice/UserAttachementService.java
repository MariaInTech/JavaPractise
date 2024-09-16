package com.example.assignementproject.userservice;

import com.example.assignementproject.entities.Attachment;
import com.example.assignementproject.entities.User;
import com.example.assignementproject.projection.UserAttachmentProjection;
import com.example.assignementproject.repository.AttachmentRepository;
import com.example.assignementproject.repository.UserAttachmentViewRepository;
import com.example.assignementproject.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserAttachementService {

    private UserRepository userRepository;
    private AttachmentRepository attachmentRepository;
    private UserAttachmentViewRepository userAttachmentViewRepository;

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getUsersByAge(Integer age) {
        return userRepository.findByAge(age);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<UserAttachmentProjection> getAllUserAttachments() {
        return userAttachmentViewRepository.findAllUserAttachments();
    }

    public List<Attachment> getAttachmentsByUserId(Long userId) {
        return attachmentRepository.findByUserId(userId);
    }

    public Attachment saveAttachment(Attachment attachment) {
        return attachmentRepository.save(attachment);
    }

}
