package com.github.flowerl.springboot.test.web;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Application {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/now")
    String hehe() {
        return "现在时间：" + (new Date().toString());
    }
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
