package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com"})
public class DemoPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPracticeApplication.class, args);
	}

}
