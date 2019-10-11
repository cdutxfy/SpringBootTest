package com.fields.business;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.fields.business.mapper")
@SpringBootApplication
public class SpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}

}
