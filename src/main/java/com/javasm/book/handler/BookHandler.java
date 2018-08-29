package com.javasm.book.handler;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author Alex
 * @creartTime 2018/8/29 - 10:03
 * @function
 */

@RequestMapping("book")
@Controller
public class BookHandler {
    //log4j2
    private static final Logger log = LogManager.getLogger(BookHandler.class);

    @RequestMapping("log")
    @ResponseBody
    public String testLog(){
        log.debug("1111");
        log.error("2222");
        log.info("33333");

        return "logTest";
    }
}
