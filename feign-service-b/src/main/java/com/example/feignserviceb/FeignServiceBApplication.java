package com.example.feignserviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FeignServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignServiceBApplication.class, args);
    }
}