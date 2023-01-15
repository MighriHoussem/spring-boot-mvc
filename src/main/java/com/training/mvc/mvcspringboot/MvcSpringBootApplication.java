package com.training.mvc.mvcspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.training.mvc.mvcspringboot.controller")
@SpringBootApplication
public class MvcSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcSpringBootApplication.class, args);
	}

}
