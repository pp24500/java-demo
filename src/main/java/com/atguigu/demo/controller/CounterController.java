package com.atguigu.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {

	
	@GetMapping("/hello")
	public String count() {
		
		return "+++chengziyu----";
	}
}
