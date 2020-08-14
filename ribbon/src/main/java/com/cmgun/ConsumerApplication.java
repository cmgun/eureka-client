package com.cmgun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * consumer with ribbon
 *
 * Created by cmgun on 2019/7/15
 */
//@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {

//
//    @Bean
//    @LoadBalanced
//    RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
