package com.alex.clouddemoprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AlexPCCW
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Provider!";
    }

    @GetMapping("/hiFeign")
    public String hiFeign(String message) {
        if (message == null || "".equals(message)) {
            message = "Default";
        }
        return "Hi, Feign, " + message;
    }
}
