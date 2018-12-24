package com.mighty.eurekaclient.controller;


import com.mighty.springcloud.feign.helloserviceapi.dto.User;
import com.mighty.springcloud.feign.helloserviceapi.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RefactorHelloController
 *
 * @author mighty
 * @create 2018-12-24 9:43
 */
@RestController
public class RefactorHelloController implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }

    @Override
    public User hello(String name, Integer age) {
        return new User(name, age);
    }

    @Override
    public String hello(User user) {
        return "Hello " + user.getName() + "," + user.getAge();
    }

    @RequestMapping("/abc")
    public String abc() {
        String returnVal = "";
        try {
            returnVal = this.getClass().getDeclaredMethod("hello", String.class).getDeclaredAnnotations().toString();
            System.out.println(this.getClass().getDeclaredMethod("hello", String.class).getDeclaredAnnotations());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


        return returnVal;
    }

    @Override
    public String nihao() {
        return "ni hao";
    }
}
