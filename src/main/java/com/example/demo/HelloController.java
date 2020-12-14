package com.example.demo;

import org.lyh.starter.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource(name = "demo")
    HelloService helloService;

    @RequestMapping("/hello1")
    public Object hello() {
        return helloService.say("weqwe");
    }
}
