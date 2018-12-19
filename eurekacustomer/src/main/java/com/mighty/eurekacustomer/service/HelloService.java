package com.mighty.eurekacustomer.service;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * hello service
 *
 * @author mighty
 * @create 2018-12-06 10:39
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();

    }

    public String helloFallback(){
        return "error";
    }

}
