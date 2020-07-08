package com.diyiliu.cloud.config.nacos.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Description: Application
 * Author: DIYILIU
 * Update: 2020-07-08 10:08
 */

@EnableConfigServer
@SpringBootApplication
public class Application {

    public static void main(String[] args) {


        SpringApplication.run(Application.class, args);
    }
}
