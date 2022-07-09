package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.TestService;

@RestController
public class ViewController {
	
	@Autowired
	private TestService testService ;
	
	@GetMapping("/details")
	public String getDetails() {
		testService.test();
		return null;
	}
}
