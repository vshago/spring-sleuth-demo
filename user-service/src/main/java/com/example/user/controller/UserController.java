package com.example.user.controller;

import com.example.user.client.BonusClient;
import com.example.user.client.NotificationClient;
import com.example.user.client.model.NotificationRequest;
import com.example.user.model.RegisterRequest;
import com.example.user.model.RegisterResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final BonusClient bonusClient;
    private final NotificationClient notificationClient;

    @PostMapping("/register")
    RegisterResponse register(@RequestBody RegisterRequest registerRequest) {
        log.info("User registration request received");
        String bonusId = bonusClient.register();
        String userId = UUID.randomUUID().toString();

        notificationClient.send(new NotificationRequest(userId, "email"));

        return new RegisterResponse(userId, bonusId);
    }
}
