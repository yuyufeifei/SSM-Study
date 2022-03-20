package com.gzh.controller;

import com.gzh.entity.Book;
import com.gzh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author GZH
 * @date 2021-11-24
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/all")
    public String listAllBook(Model model) {
        List<Book> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }
}
