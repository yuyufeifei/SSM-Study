package com.gzh.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author GZH
 * @date 2021-11-21
 * 不使用注解进行开发
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        //封装对象
        mv.addObject("msg", "Hello SpringMVC");
        //封装要跳转的视图 不含前后缀
        mv.setViewName("hello");
        return mv;
    }
}
