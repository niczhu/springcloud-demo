package com.example.hystrixfeign;

import org.springframework.stereotype.Component;

@Component
public class TestServiceHystrix implements TestService {

    @Override
    public String hi(String name) {
        return "error! sorry ==>" + name;
    }
}
