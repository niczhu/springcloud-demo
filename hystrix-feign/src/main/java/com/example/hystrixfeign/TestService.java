package com.example.hystrixfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="service-hi",fallback = TestServiceHystrix.class)
public interface TestService {

    @GetMapping("hi")
    public String hi(@RequestParam String name);

}
