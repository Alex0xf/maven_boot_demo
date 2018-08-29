package com.javasm.book.handler;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.book.model.Book;
import com.javasm.book.service.IBookService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @author Alex
 * @creartTime 2018/8/29 - 10:03
 * @function
 */

@RequestMapping("book")
@Controller
@EnableTransactionManagement//事物开启
public class BookHandler {
    //log4j2
    private static final Logger log = LogManager.getLogger(BookHandler.class);

    @Autowired
    IBookService bookService;

    @RequestMapping("log")
    @ResponseBody
    public String testLog(){
        log.debug("1111");
        log.error("2222");
        log.info("33333");

        return "logTest";
    }

    @RequestMapping("list")
    public String jumpBookList(Model model){
        //使用分页插件
        PageHelper.startPage(1,10);
        List<Book> list=bookService.selectBookList();
        model.addAttribute("bookList",list);
        PageInfo info=new PageInfo(list);
        model.addAttribute("page",info);
        return "book/list";
    }
}
