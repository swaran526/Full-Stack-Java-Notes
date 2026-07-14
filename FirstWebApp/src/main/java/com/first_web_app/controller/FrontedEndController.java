package com.first_web_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontedEndController {
	
@GetMapping("/home")
public String home() {
	return "home";
}
}