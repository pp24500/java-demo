package com.atguigu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {

	
	@GetMapping("/hello")
	public String count() {
		return "+++";
	}
}
