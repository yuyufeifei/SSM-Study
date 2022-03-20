package com.gzh.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.gzh.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author GZH
 * @date 2021-11-23
 */
@Controller
public class JsonController {

    @RequestMapping("/json")
    @ResponseBody
    public String testJson() throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        User user = new User("郭", 4, "男");
        return om.writeValueAsString(user);
    }

    @RequestMapping("/jsonDate")
    @ResponseBody
    public String testJson2() throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();

        //不使用时间戳方式返回
        om.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        om.setDateFormat(sdf);

        return om.writeValueAsString(new Date());
    }

    @RequestMapping("/fastjson")
    @ResponseBody
    public String testJson3() throws JsonProcessingException {
        User user = new User("郭", 4, "男");
        return JSONObject.toJSONString(user);
    }
}
