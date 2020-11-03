package com.lind.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://www.lind.com:8082", name = "demo-product")
public interface DemoProductClient {
    @GetMapping(path = "/users")
    String getUserInfo();

    @GetMapping("/index")
    String index();
}
