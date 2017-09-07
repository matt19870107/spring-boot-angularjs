package com.ma.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootAngularjsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngularjsApplication.class, args);
	}
	
	@RequestMapping(value="/search",produces= {MediaType.APPLICATION_JSON_VALUE})
	public Person search(@ModelAttribute("personName") String name) {
		return new Person(name,30,"大连");
	}
}
