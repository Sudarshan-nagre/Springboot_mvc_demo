package com.sud.mvc.web_mvc_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hi")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/bye")
	public ModelMap save() {
		
		ModelMap m= new ModelMap();
		m.addAttribute("name", "Sudarshan");
		return m;
	}
}
