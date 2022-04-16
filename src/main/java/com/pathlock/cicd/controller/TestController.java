package com.pathlock.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cicd")
public class TestController {
    
	@GetMapping(path = "/test")
	public String getTest() {
		return "test success";
	}
}
