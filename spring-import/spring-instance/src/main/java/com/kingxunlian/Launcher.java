package com.kingxunlian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAsync
public class Launcher {

    public static void main(final String[] args) {
        SpringApplication.run(Launcher.class, args);
    }
}
