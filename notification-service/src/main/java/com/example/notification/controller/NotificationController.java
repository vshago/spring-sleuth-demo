package com.example.notification.controller;

import com.example.notification.client.ExternalEmailGateway;
import com.example.notification.model.NotificationRequest;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notification")
@Slf4j
public class NotificationController {

    private final ExternalEmailGateway gateway;

    @PostMapping("/send")
    @SneakyThrows
    String send(@RequestBody NotificationRequest notificationRequest) {
        log.info("Notification request received");
        //e.g. load from DB & logic
        Thread.sleep(new Random().nextInt(100, 1000));

        gateway.sendEmail(1);

        return "ok";
    }
}
