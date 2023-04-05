package com.example.EmployeSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//user

@RestController
@RequestMapping("/noauth")
public class Controller2 {
	@GetMapping("/goodmorning")
	public String greeting() {
		return"hi Rayo goodmorning";
	}
}