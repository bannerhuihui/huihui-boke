package com.huihui.it.boke.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: code
 * @description:
 * @author: Mr.Yuan
 * @create: 2021-08-26 07:00
 **/
@Configuration
public class ConfigBean {

    /** @Bean
        @LoadBalanced  // ribbon 实现负载均衡
        public RestTemplate getRestTemplate(){
            return new RestTemplate();
        }


     * 使用ribbon controller就用
     *
     * private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";
     *     @RequestMapping("/consumer/dept/get/{id}")
     *     public Dept get(@PathVariable("id") long id){
     *         return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
     *     }
     * 启动类
     * 添加一个注解
     * @RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = HuihuiRule.class) // 在服务启动时
     */
}
