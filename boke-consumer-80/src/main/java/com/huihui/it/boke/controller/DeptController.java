package com.huihui.it.boke.controller;

import com.huihui.it.boke.pojo.Dept;
import com.huihui.it.boke.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: code
 * @description:
 * @author: Mr.Yuan
 * @create: 2021-08-26 06:52
 **/
@RestController
public class DeptController {

    /**
    * 使用feign 来实现负载均衡
    */

    @Autowired
    private DeptClientService deptClientService = null;

    @GetMapping("/consumer/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id){
        return deptClientService.queryBuId(id);
    }



}
