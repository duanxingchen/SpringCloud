package com.example.helloservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        System.out.print("3333333333");
        System.out.print("44444444");
        return  "hello world";
    }
}
