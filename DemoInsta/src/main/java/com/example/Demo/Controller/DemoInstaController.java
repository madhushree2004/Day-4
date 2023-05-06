package com.example.Demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoInstaController {

	@GetMapping("/getpost")
	public String getPost(@RequestParam String username,@RequestParam String password)
	{
		if(username.equals("Madhushree")&&password.equals("12345"))
		{
			return "Login successful";
		}
		else
		{
			return "Login Failed Please Check your Information";
		}
	}
}
