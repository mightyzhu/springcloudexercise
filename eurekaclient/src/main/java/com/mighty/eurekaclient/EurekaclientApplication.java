package com.mighty.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableTurbine
public class EurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientApplication.class, args);
    }

    @RequestMapping("/hello")
    public String home() {
        return "Hello world";
    }
}
