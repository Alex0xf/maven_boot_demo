package com.javasm.book.service.impl;

import com.javasm.book.dao.BookMapper;
import com.javasm.book.handler.BookHandler;
import com.javasm.book.model.Book;
import com.javasm.book.service.IBookService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    private static final Logger log = LogManager.getLogger(BookServiceImpl.class);


    @Override
    public List<Book> selectBookList() {
        //之前使用redis的操作
        //先去redis查数据
        //如果查询到了 返回数据 否则去数据库查询并放入redis中 然后返回
        //现在用注解的方式使用 可以加在service接口也可以加在实现类上
        log.debug("selectBookList被调用");
        return bookMapper.selectBookList();
    }
}
