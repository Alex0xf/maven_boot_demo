package com.javasm.book.service;

import com.javasm.book.model.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Alex
 * @creartTime 2018/8/29 - 17:36
 * @function
 */
public interface IBookService {

    @Transactional//加上事物
    List<Book> selectBookList();
}
