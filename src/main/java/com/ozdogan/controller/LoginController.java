package com.ozdogan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping("/page")
	public String loginPage(Model model) {
		model.addAttribute("message", "This is the user page!");
		return "/login/page";
	}
}
