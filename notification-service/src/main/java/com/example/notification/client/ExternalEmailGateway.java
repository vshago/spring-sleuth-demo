package com.example.notification.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "externalEmailGateway", url = "https://httpbin.org")
public interface ExternalEmailGateway {
    @GetMapping("/delay/{delay}")
    String sendEmail(@PathVariable int delay);
}
