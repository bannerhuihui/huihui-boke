package com.huihui.it.boke.service;

import com.huihui.it.boke.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;


/**
 * @program: springcloud
 * @description:
 * @author: Mr.Yuan
 * @create: 2021-08-25 09:18
 **/
@Component
public class DeptFallbackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept queryBuId(Long id) {
                Dept dept = new Dept();
                dept.setDeptno(id);
                dept.setDname("降级了！暂时不可用");
                return dept;
            }


        };
    }
}
