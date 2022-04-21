package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController 
{

	@RequestMapping("/")
	public String index() 
	{
		String message = "Greetings from Spring Boot + Tanzu! CustomValueBe: ";

		String messsageFromVar = null;

		messsageFromVar = System.getenv("MY_VARIABLE");

		if ( messsageFromVar != null )
		{
			message = message + messsageFromVar;
		}

		return( message );
	}

}