package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class demoPracticeController {
	
	@RequestMapping("/Home")
	public String home() {
		return "home";
	}
	
}
