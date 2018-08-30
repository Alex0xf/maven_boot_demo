package com.javasm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan("com.javasm.*.dao")//所有mapper注入到spring容器中
@EnableTransactionManagement//开启事务
@EnableCaching//开启缓存注解
@EnableScheduling//开启定时任务调度
public class SpringIoDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringIoDemoApplication.class, args);
    }


}
