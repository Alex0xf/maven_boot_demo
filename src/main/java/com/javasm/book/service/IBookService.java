package com.javasm.book.service;

import com.javasm.book.model.Book;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @author Alex
 * @creartTime 2018/8/29 - 17:36
 * @function
 */

public interface IBookService {
   //@Cacheable(cacheNames = "book_list",key = "#book.bid",unless = "#result==null",condition = "#book.bid>0")

    @Cacheable(cacheNames = "book_list",unless = "#result==null")
    List<Book> selectBookList();
}
