package com.example.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    public String test(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT-TEST/test",String.class);
    }
}
