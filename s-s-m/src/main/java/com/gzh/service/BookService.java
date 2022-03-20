package com.gzh.service;

import com.gzh.entity.Book;

import java.util.List;

/**
 * @author GZH
 * @date 2021-11-24
 */
public interface BookService {

    int addBook(Book book);

    int deleteBookById(int id);

    int updateBook(Book book);

    Book queryBookById(int id);

    List<Book> queryAllBook();

}
