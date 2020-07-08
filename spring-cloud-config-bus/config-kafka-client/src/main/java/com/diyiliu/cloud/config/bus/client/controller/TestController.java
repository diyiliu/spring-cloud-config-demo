package com.diyiliu.cloud.config.bus.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TestController
 * Author: DIYILIU
 * Update: 2020-07-08 10:28
 */

@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String getFrom(){

        return this.from;
    }
}
