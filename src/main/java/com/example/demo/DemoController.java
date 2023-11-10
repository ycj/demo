package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${demo.test.name:defaultValue}")
    private String name;

    @GetMapping("/")
    public String hello(){
        return "It's on a test";
    }

    @GetMapping("/test")
    public String test(){
        return name;
    }
}
