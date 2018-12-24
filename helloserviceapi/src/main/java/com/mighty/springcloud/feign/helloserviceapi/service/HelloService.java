package com.mighty.springcloud.feign.helloserviceapi.service;

import com.mighty.springcloud.feign.helloserviceapi.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * HelloServcie
 *
 * @author mighty
 * @create 2018-12-21 11:26
 */
@RequestMapping("/refactor")
public interface HelloService {
    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello6", method = RequestMethod.POST)
    String hello(@RequestBody User user);

    @RequestMapping(value = "/hello11", method = RequestMethod.GET)
    String nihao();

}
