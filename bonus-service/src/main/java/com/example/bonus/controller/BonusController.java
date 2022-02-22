package com.example.bonus.controller;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/bonus")
@Slf4j
public class BonusController {

    @PostMapping("/register")
    @SneakyThrows
    String register() {
        log.info("Bonus program registration request received");
        //e.g. load from DB
        Thread.sleep(new Random().nextInt(100, 1000));
        return UUID.randomUUID().toString();
    }
}

