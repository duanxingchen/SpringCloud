package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class configControl {

    @Value("${from}")
    private String port;

    @RequestMapping("getport")
    public String getPort(){
        return this.port;
    }
}
