package com.gzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author GZH
 * @date 2021-11-26
 */
@Controller
public class FileController {

    @RequestMapping("/upload")
    public String fileUpload(@RequestParam("file")CommonsMultipartFile file, HttpServletRequest request) throws IOException {
        //获取文件名
        String uploadFileName = file.getOriginalFilename();
        //文件上传路径
        String path = request.getContextPath();//可能不对
        request.getServletPath();

        file.transferTo(new File(path + uploadFileName));

        return "redirect:/index.jsp";
    }

}
