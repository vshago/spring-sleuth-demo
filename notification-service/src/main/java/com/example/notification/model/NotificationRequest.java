package com.example.notification.model;

import lombok.Value;

@Value
public class NotificationRequest {
    String userId;
    String type;
}
