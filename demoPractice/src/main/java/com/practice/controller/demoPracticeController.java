package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.model.student;
import com.practice.repository.repository;


@Controller
public class demoPracticeController {
	@Autowired
	private repository repo;
	
	@RequestMapping("/Home")
	public String home(@ModelAttribute("student") student student) {
		return "home";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") student student,Model model) {
		repo.save(student);
		model.addAttribute("isDone", true);
		model.addAttribute("student", student);
		model.addAttribute("sucess", "Student Added successfully");
		return "home";
	}
	
}
