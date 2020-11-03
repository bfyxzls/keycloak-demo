package com.lind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TestIdentityServer4Application {
    public static void main(String[] args) {
        SpringApplication.run(TestIdentityServer4Application.class, args);
    }
}
