package com.gzh.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author GZH
 * @date 2021-11-07
 */
@Component
@Scope("singleton")
public class Cat {
    @Value("小花")
    private String name;

    public void sout(){
        System.out.println("miao");
    }
}
