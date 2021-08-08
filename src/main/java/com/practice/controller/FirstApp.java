package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstApp {
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("msg", "Welcome to the mvc project using thymeleaf");
		return "helloWorld";
	}

}
