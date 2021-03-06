package com.book.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 一点点
 * @Date: 2018/11/24 11:18
 * @Version 1.0
 */
@RestController
public class HiController {

    @Value("${server.port}")
    String port;
    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String home(@RequestParam String name){
        return "hi"+name+"i am lucy and from port:"+port;
    }

    public String hiError(String name){
        return "hi,"+name+",sorry,error";
    }
}
