package com.huihui.it.boke.service.impl;

import com.huihui.it.boke.mapper.DeptMapper;
import com.huihui.it.boke.pojo.Dept;
import com.huihui.it.boke.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: code
 * @description:
 * @author: Mr.Yuan
 * @create: 2021-08-26 05:16
 **/
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept queryDeptById(Long id) {
        return deptMapper.queryDeptById(id);
    }
}
