package com.aug.get_request.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {
	@RequestMapping("/")
	public String greet()
	{
		return "never give up";
	}
	@GetMapping("/about")
	public String about()
	{
		return "you keep on going";
	}

}
