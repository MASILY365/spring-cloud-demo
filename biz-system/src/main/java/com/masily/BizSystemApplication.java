package com.masily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BizSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizSystemApplication.class, args);
    }

}
