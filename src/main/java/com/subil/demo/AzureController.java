package com.subil.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureController {
	
	@GetMapping("hello")
	public String hello() {
		
		return "its Successed";
	}

}
