package com.masily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServeGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServeGatewayApplication.class, args);
    }

}
