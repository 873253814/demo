package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "com.lyh")
@Component
public class ConfigBean {
    private String name;
    private String action;

    public String getName() {
        return name;
    }

    public String getAction() {
        return action;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
