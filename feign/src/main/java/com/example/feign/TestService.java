package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-hi")
public interface TestService {

    @GetMapping("hi")
    public String hi(@RequestParam String name);

}
