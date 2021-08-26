package com.huihui.it.boke.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: code
 * @description:
 * @author: Mr.Yuan
 * @create: 2021-08-26 05:05
 **/
@Data
@NoArgsConstructor
public class Dept implements Serializable {

    private Long deptno;

    private String dname;

    private String db_source;

    public Dept(String dname){
        this.dname = dname;
    }

}
