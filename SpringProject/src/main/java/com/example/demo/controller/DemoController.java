package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;

@RestController
public class DemoController { 
	
	@Autowired	
	private DemoService demoService;
	
	//GET 메소드 
	@GetMapping("/demo")	
	public String getDemo () {
		String demo = demoService.getDemo();
		return demo;	
	}
	
	//POST 메소드  
	@PostMapping("/demo")
	public String postDemo () {
		String demo = demoService.getDemo();
		return demo;
	}
}

