package com.diyiliu.cloud.config.bus.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description: Application
 * Author: DIYILIU
 * Update: 2020-07-08 10:25
 */

@EnableDiscoveryClient
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
