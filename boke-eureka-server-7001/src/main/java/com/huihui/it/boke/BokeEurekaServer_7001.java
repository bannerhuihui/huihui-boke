package com.huihui.it.boke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: code
 * @description:
 * @author: Mr.Yuan
 * @create: 2021-08-26 05:57
 **/
@SpringBootApplication
@EnableEurekaServer
public class BokeEurekaServer_7001 {

    public static void main(String[] args) {
        SpringApplication.run(BokeEurekaServer_7001.class,args);
    }
}
