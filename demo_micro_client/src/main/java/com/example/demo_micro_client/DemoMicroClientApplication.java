package com.example.demo_micro_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoMicroClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMicroClientApplication.class, args);
    }

}
