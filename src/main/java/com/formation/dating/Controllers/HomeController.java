package com.formation.dating.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	@ResponseBody
	public String index() {
		return "<h1>home</h1>";
	}

	@GetMapping("/")
	public String index2(@RequestParam(required = false, defaultValue = "Bienvenue") String name, Model model) {
		model.addAttribute("hello", name);
		return "index";
	}
	

	
	

}
