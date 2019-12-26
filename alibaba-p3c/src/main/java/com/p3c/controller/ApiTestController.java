package com.p3c.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiTestController {
	
	@GetMapping("/param")
	public String name(@RequestBody ParamTest param) {
		
		return "test";
	}
	
//	public void testVairable(int a , String ... names, int b) {
//		
//	}
}
