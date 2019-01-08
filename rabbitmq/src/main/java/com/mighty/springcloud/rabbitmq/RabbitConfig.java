package com.mighty.springcloud.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author mighty
 * @create 2019-01-08 16:17
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue HelloQueue() {
        return new Queue("hello");
    }
}
