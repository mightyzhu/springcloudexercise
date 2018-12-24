package com.mighty.springcloud.feign.controller;

import com.mighty.springcloud.feign.helloserviceapi.dto.User;
import com.mighty.springcloud.feign.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * consumer
 *
 * @author mighty
 * @create 2018-12-19 15:03
 */
@RestController
public class ConsumerController {

    @Autowired
    RefactorHelloService refactorHelloService;

    @RequestMapping(value = "feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return refactorHelloService.hello("1");
    }

    @RequestMapping(value = "feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("abc")).append("\n");
        sb.append(refactorHelloService.hello("aaa")).append("\n");
        sb.append(refactorHelloService.hello("ZWB", 30)).append("\n");
        sb.append(refactorHelloService.hello(new User("Mighty", 31))).append("\n");
        return sb.toString();

    }
}
