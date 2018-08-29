package com.javasm.book.service.impl;

import com.javasm.book.dao.BookMapper;
import com.javasm.book.model.Book;
import com.javasm.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Alex
 * @creartTime 2018/8/29 - 17:37
 * @function
 */
@Service
@Transactional
public class BookServiceImpl implements IBookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> selectBookList() {


        return bookMapper.selectBookList();
    }
}
