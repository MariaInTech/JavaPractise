package com.example.assignementproject.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Attachement", schema = "public")
@Getter
@Setter
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "picture")
    private String picture;

//    @Column(name = "picture")
//    private byte[] picture;

    @Column(name = "id_expired_flag")
    private char idExpiredFlag;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;
}
