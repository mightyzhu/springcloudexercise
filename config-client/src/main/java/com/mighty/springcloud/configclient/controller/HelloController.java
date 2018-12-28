package com.mighty.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mighty
 * @create 2018-12-28 14:51
 */
@RestController
public class HelloController {
    @Value("${from}")
    private String from;

    @RequestMapping("/hello")
    public String from(){
        return this.from;
    }

}
