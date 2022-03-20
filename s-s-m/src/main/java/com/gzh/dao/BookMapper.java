package com.gzh.dao;

import com.gzh.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author GZH
 * @date 2021-11-24
 */
public interface BookMapper {

    int addBook(Book book);

    int deleteBookById(@Param("bookId") int id);

    int updateBook(Book book);

    Book queryBookById(@Param("bookId") int id);

    List<Book> queryAllBook();

}
