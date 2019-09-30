package com.example.eurekacli1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaCli1Application {

    public static void main(String[] args) {

        SpringApplication.run(EurekaCli1Application.class, args);
    }

    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public Object cli(@RequestParam String name){
        return "hi  test.. name=>"+name +" prot=>"+port;
    }

    @GetMapping("test")
    public Object test(){
        return "test....";
    }

}
