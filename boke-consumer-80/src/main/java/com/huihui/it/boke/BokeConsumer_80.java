package com.huihui.it.boke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: code
 * @description:
 * @author: Mr.Yuan
 * @create: 2021-08-26 06:49
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.huihui.it.boke"})
@ComponentScan("com.huihui.it.boke")
public class BokeConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(BokeConsumer_80.class,args);
    }
}
