package com.huihui.it.boke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: code
 * @description:
 * @author: Mr.Yuan
 * @create: 2021-08-26 07:59
 **/
@SpringBootApplication
@EnableZuulProxy
public class BokeZull_6001 {

    public static void main(String[] args) {
        SpringApplication.run(BokeZull_6001.class,args);
    }
}
