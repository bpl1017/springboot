package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-dubbo-provider.xml")
@MapperScan("com.jk.dao")
public class SsmThreeSpringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(SsmThreeSpringbootApplication.class, args);
	}
}
