package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
    @Autowired
    private Person person;

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/hello")
    public Object index() {

        //redisUtil.set("lyh", "ppppp");
        //redisUtil.set("person", person);
//        System.out.println(person.getMap() + person.getName() + person.getList());
//        return redisUtil.get("person");
        return "hhh";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
