package com.huihui.it.boke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: code
 * @description: boke
 * @author: Mr.Yuan
 * @create: 2021-08-26 05:11
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
public class BokeMysqlDb_8002 {

    public static void main(String[] args) {
        SpringApplication.run(BokeMysqlDb_8002.class,args);
    }
}
