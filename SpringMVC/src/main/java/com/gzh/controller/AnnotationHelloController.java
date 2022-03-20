package com.gzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author GZH
 * @date 2021-11-22
 */
@Controller
@RequestMapping("/annotation")
public class AnnotationHelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg", "hello,SpringMVC!");
        return "hello";
        //重定向
        //return "redirect:/index.jsp";
    }

}
