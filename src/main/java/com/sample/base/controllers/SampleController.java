package com.sample.base.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/hello")
	public String sayHello() {
		//Testing comment
		return "Hello";
	}
}
