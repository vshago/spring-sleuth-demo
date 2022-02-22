package com.example.user.client.model;

import lombok.Value;

@Value
public class NotificationRequest {
    String userId;
    String type;
}
