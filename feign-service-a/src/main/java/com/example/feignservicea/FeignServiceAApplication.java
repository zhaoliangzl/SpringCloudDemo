package com.example.feignservicea;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication

@EnableDiscoveryClient
//@EnableFeignClients注解用于开启Feign远程服务调用功能
@EnableFeignClients
public class FeignServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignServiceAApplication.class, args);
    }

}

