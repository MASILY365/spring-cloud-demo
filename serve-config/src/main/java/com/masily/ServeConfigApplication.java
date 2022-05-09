package com.masily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心入口类
 *
 * @author masily
 */
@EnableConfigServer
@SpringBootApplication
public class ServeConfigApplication {

    public static void main(String[] args) {

        System.out.println("配置中心启动了！");
        SpringApplication.run(ServeConfigApplication.class, args);
    }

}
