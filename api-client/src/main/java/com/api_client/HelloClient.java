package com.api_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


    @FeignClient(name = "hello-service")
    public interface HelloClient {
        @GetMapping("/hello")
        String getHelloMessage();
    }
