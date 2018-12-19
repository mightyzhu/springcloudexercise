package com.mighty.springcloud.feign.controller;

import com.mighty.springcloud.feign.service.HelloService;
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
    HelloService helloService;

    @RequestMapping(value = "feign-consumer", method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }

}
