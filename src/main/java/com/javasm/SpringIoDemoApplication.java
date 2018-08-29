package com.javasm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan("com.javasm.*.dao")//所有mapper注入到spring容器中
public class SpringIoDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringIoDemoApplication.class, args);
    }


}
