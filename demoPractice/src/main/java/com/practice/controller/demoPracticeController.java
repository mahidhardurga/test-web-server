package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.model.Student;
import com.practice.service.demoPracticeService;

@Controller
//@RequestMapping("/demoPractice")
public class demoPracticeController {
	
	@Autowired
	private demoPracticeService service;
	
	@RequestMapping("/Home")
	public String home(@ModelAttribute("student") Student student) {
		return "home";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") Student student, Model model) {
		service.save(student);
		model.addAttribute("isDone", true);
		model.addAttribute("student", student);
		model.addAttribute("Sucess", "student created sucessfully");
		return "home";
	}
}
