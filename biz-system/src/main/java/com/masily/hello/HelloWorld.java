package com.masily.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author masily
 * @since 2022/4/27 9:17
 */
@RestController
@RequestMapping(value = "/test")
public class HelloWorld {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello world! system";
    }
}
