package com.example.assignementproject.projection;

import org.springframework.beans.factory.annotation.Value;

public interface UserAttachmentProjection {
    Long getUserId();
    String getFullName();
    int getAge();
    String getPicture();
    @Value("#{target.idExpiredFlag == 'Y'}")
    boolean getIsExpired();
}
