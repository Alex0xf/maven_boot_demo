package com.javasm.config;


import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Alex
 * @creartTime 2018/8/28 - 17:54
 * @function 自定义时间转换器
 */
public class MyDateFormat implements Converter<String, Date> {
    private static final String dateFormat = "yyyy/MM/dd";
    @Override
    public Date convert(String source) {
        if (StringUtils.isEmpty(source)) {
            return null;
        }
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
            Date date = formatter.parse(source);
            return date;
        } catch (Exception e) {
            throw new RuntimeException(String.format("parser %s to Date fail", source));
        }
    }
}