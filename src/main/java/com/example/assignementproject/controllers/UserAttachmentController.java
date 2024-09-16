package com.example.assignementproject.controllers;

import com.example.assignementproject.entities.User;
import com.example.assignementproject.entities.Attachment;
import com.example.assignementproject.projection.UserAttachmentProjection;
import com.example.assignementproject.userservice.UserAttachementService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserAttachmentController {

    private UserAttachementService userAttachementService;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userAttachementService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/age/{age}")
    public ResponseEntity<List<User>> getUsersByAge(@PathVariable Integer age) {
        List<User> users = userAttachementService.getUsersByAge(age);
        return ResponseEntity.ok(users);
    }

    @PostMapping("/adduser")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User savedUser = userAttachementService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @PostMapping("/addattachment")
    public ResponseEntity<Attachment> saveAttachment(@RequestBody Attachment attachment) {
        Attachment savedAttachment = userAttachementService.saveAttachment(attachment);
        return ResponseEntity.ok(savedAttachment);
    }
    @GetMapping("/user-attachments")
    public List<UserAttachmentProjection> getUserAttachments() {
        return userAttachementService.getAllUserAttachments();
    }

}
