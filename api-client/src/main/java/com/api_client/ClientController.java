package com.api_client;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    private  final HelloClient helloClient;

    public ClientController(HelloClient helloClient) {
        this.helloClient = helloClient;
    }

    @GetMapping("/call-hello")
    public String callHello() {
        return "Le service hello dit: " + helloClient.getHelloMessage();
    }

}
