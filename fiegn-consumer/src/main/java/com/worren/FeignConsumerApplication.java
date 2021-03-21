package com.worren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class FeignConsumerApplication {


    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication.class, args);
    }
}
