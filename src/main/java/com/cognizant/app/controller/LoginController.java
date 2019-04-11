package com.cognizant.app.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
	
	@GetMapping(value="/hello")
	public String sayHello()
	{
		return "Hello Boot";
	}
	
	@GetMapping(value="/login")
	public ModelAndView userLogin()
	{
		return new ModelAndView("login");
	}
	
	@PostMapping(value="/loginUser")
	public String userLoggedin(@RequestParam Map<String, String> parameters) 
	{
		return "Hi "+parameters.get("emailAddress");
	}

}
