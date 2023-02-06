package com.axis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class HelloController {
	
	@GetMapping("/message")
	public String displayMessage()
	{
		return "welcome to restful web services";
	}

	@GetMapping("/showcatlog")
	public String catlog()
	{
		return "this is a catlog";
	}
		
	

}

