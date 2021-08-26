package com.huihui.it.boke.service;

import com.huihui.it.boke.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Component
@FeignClient(value = "BOKE-IT-MYSQL-DB",fallbackFactory = DeptFallbackFactory.class)
public interface DeptClientService {

    @GetMapping("/dept/get/{id}")
    public Dept queryBuId(@PathVariable("id") Long id);


}
