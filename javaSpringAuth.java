package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class Hello {

	@GetMapping("/")
	public String greet(HttpServletRequest request) {
		return "hello Shreya,Welcome spring!" + request.getSession().getId();
	}
}


application.properties

spring.application.name=SpringSecEx
spring.security.user.name=Shreya
spring.security.user.password=Datta
