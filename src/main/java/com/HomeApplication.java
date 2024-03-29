package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "hello word";
    }

}
