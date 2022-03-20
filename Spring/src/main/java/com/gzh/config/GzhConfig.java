package com.gzh.config;

import com.gzh.entity.Cat;
import com.gzh.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author GZH
 * @date 2021-11-07
 *
 * 这个@Configuration代表一个配置类，就相当于一个beans.xml
 * 这个@Import引入一个配置类
 */
@Configuration
@ComponentScan("com.gzh.entity")
@Import(GzhConfig2.class)
public class GzhConfig {

    /**
     * 注册一个bean，相当于一个bean标签
     * 这个方法的名字，相当于bean标签中的id属性
     * 这个方法的返回值，相当于bean标签中的class属性
     */
    @Bean
    public Cat getCat(){
        return new Cat();
    }
}
