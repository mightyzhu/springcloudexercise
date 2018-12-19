package com.mighty.springcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author mighty
 * @create 2018-12-19 15:01
 */
@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

}
