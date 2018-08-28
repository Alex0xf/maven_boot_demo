package com.javasm.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Alex
 * @creartTime 2018/8/28 - 16:24
 * @function
 */
public class LoginIntercept implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登陆拦截器==spring mvc的拦截器
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);
        Object userInfo = request.getSession().getAttribute("userInfo");
            if (userInfo != null) {
                return true;//放过
            } else {
                request.getRequestDispatcher("/login").forward(request, response);
                return false;
        }
    }


}
