package com.devops.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/devops")
@RestController
public class DefaultController {

	
	@GetMapping("/test")
	public String getMessage() {
		return "Hello World!";
	}
	
	@GetMapping("/testmail")
	public String getTestMessage() {
		return "Devops CICD successful!";
	}
	
	@GetMapping("/getMessage")
	public String getTestMessage1(@RequestParam("message") String message) {
		return "CICD pipeline successfully deployed!"+message;
	}
}
