package com.authentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "index";
	}
	@GetMapping("/about")
	@ResponseBody
	public String about() {
		return "about";
	}
	@GetMapping("/profile")
	@ResponseBody
	public String profile() {
		return "profile";
	}
	@GetMapping("/notAccess")
	@ResponseBody
	public String notAccess() {
		return "You are not authorised";
	}
}
