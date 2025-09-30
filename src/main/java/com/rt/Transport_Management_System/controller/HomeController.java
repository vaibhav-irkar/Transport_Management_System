package com.rt.Transport_Management_System.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String login() {
		return "login";
		
	}
	
@GetMapping("/login")
  public String index() {
	return "index";
	  
  }
}
