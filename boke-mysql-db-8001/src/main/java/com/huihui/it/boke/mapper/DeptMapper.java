package com.huihui.it.boke.mapper;

import com.huihui.it.boke.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptMapper {
    Dept queryDeptById(Long id);
}
