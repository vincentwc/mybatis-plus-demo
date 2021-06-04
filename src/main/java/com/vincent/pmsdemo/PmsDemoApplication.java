package com.vincent.pmsdemo;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vincent.pmsdemo.mapper")
public class PmsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsDemoApplication.class, args);
	}

}
