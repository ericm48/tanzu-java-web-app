package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController 
{

	@RequestMapping("/")
	public String index() 
	{
		String message = "Greetings from Spring Boot + Tanzu! 20-Apr-2022!";

		return( message );
	}

}