package com.alex.clouddemoconsumer.controller;

import com.alex.clouddemoconsumer.service.ProviderFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author AlexPCCW
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource
    private ProviderFeignService providerFeignService;

    @GetMapping("/hi")
    public String hi() {
        return "Hi, Consumer";
    }

    @GetMapping("/hiFeign")
    public String hiFeign(String message) {
        return providerFeignService.hiFeign(message);
    }
}
