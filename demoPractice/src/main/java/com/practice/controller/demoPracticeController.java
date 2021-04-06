package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("/demoPractice")
public class demoPracticeController {
	
	@RequestMapping("/Home")
	public String home() {
		return "home";
	}
	
	/*@RequestMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") Student student, Model model) {
		service.save(student);
		model.addAttribute("isDone", true);
		model.addAttribute("student", student);
		model.addAttribute("Sucess", "student created sucessfully");
		return "home";
	}*/
	
	@RequestMapping("/shoes")
	public String shoes() {
		return "home";
	}
	
	
}
