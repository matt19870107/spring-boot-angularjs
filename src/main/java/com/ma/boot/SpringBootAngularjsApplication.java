package com.ma.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootAngularjsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngularjsApplication.class, args);
	}
	
	@RequestMapping(value="/searh",produces= {MediaType.APPLICATION_JSON_VALUE})
	public Person search(String name) {
		return new Person("Matt",30,"大连");
	}
}
