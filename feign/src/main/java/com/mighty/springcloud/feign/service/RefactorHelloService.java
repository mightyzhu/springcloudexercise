package com.mighty.springcloud.feign.service;

import com.mighty.springcloud.feign.helloserviceapi.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * RefactorHelloService
 *
 * @author mighty
 * @create 2018-12-24 9:59
 */
@FeignClient("hello-service")
public interface RefactorHelloService extends HelloService {




}
