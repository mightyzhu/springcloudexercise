package com.mighty.eurekacustomer.controller;

import com.mighty.eurekacustomer.service.HelloService;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Consumer of services
 *
 * @author mighty
 * @create 2018-11-20 21:30
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HelloService helloService;

    @RequestMapping(value="/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.helloService();
    }
}
