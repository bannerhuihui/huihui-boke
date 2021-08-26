package com.huihui.it.boke.controller;

import com.huihui.it.boke.pojo.Dept;
import com.huihui.it.boke.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;

/**
 * @program: code
 * @description:
 * @author: Mr.Yuan
 * @create: 2021-08-26 05:13
 **/
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping(value = "/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixQueryById")
    public Dept queryDeptById(@PathVariable("id") Long id){
        Dept dept = deptService.queryDeptById(id);
        if(dept == null){
            throw new RuntimeException();
        }
        return dept;
    }


    public Dept hystrixQueryById(@PathVariable ("id") Long id){
        Dept dept = new Dept();
        dept.setDeptno(id);
        dept.setDname("没有这个用户");
        return dept;
    }
}
