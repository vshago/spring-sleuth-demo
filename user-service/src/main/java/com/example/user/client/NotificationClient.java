package com.example.user.client;

import com.example.user.client.model.NotificationRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notification", url = "http://localhost:8082/notification")
public interface NotificationClient {

    @PostMapping("/send")
    String send(@RequestBody NotificationRequest notificationRequest);
}
