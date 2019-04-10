package com.example.serverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ServerconfigApplication {

    public static void main(String[] args) {
        String string1 =new String("dddd");

        SpringApplication.run(ServerconfigApplication.class, args);
    }
}
