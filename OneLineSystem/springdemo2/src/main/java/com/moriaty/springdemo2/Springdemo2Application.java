package com.moriaty.springdemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@ComponentScan(basePackages = {"com.moriaty.springdemo2"})
@MapperScan("com.moriaty.springdemo2.mapper")
public class Springdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdemo2Application.class, args);
	}
}


