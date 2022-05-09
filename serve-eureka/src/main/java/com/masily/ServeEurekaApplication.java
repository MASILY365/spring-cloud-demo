package com.masily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心入口类
 *
 * @author masily
 */
@EnableEurekaServer
@SpringBootApplication
public class ServeEurekaApplication {

    public static void main(String[] args) {
        System.out.println("注册中心启动了！");
        SpringApplication.run(ServeEurekaApplication.class, args);
    }

}
