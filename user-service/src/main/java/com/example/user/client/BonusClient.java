package com.example.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "bonus", url = "http://localhost:8081/bonus")
public interface BonusClient {

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    String register();
}
