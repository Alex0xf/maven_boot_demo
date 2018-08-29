package com.javasm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Alex
 * @creartTime 2018/8/28 - 16:21
 * @function
 */
@Configuration//标记当前类是一个配置类 启动时会加载这个类
public class MyConfiguration implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //用户访问的路径                              实际路径
        registry.addViewController("/login").setViewName("login/login_page");
    }

 /*   @Override//视图解析器
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.print("xxxxxx");
        registry.addResourceHandler("/static/**").addResourceLocations("calsspath:/static/");
    }*/
@Override//拦截器==spring mvc的拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        //注册进spring boot中
        registry.addInterceptor(new LoginIntercept())
            .addPathPatterns("/**")//所有路径都被拦截到 除了
            .excludePathPatterns("/login")
            .excludePathPatterns("/login/**")
            .excludePathPatterns("/index.html")
            .excludePathPatterns("/css/**")
            .excludePathPatterns("/js/**")
            .excludePathPatterns("/layui/**")
            .excludePathPatterns("/img/**")
            .excludePathPatterns("/error/**")
            .excludePathPatterns("/user/**");//放过测试
    }

    @Override   //格式转换器
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new MyDateFormat());//配置时间格式转换
    }


}
