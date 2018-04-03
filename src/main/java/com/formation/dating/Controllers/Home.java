package com.formation.dating.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<h1>Bonjour les amis</h1>";
	}

	


}
