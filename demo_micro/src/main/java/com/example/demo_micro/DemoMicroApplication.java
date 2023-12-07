package com.example.demo_micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoMicroApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMicroApplication.class, args);
    }

}
