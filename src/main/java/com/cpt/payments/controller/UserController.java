package com.cpt.payments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class UserController {
	 
	@GetMapping("/hello")
	public String msgController()
    {
    	return "hello world";
    }
	@GetMapping("/addGet")
	public int addGet(@RequestParam(value="num1") int val1, 
			@RequestParam(value="num2") int val2) {
		System.out.println("Calling addGet:" +val1+" val2: " +val2);
		int res= val1+val2;
		System.out.println("result:"  +res);
		return res;
	}
	
	@PostMapping("/addPost")
	public int addPost(@RequestParam(value="num1") int val1, 
			@RequestParam(value="num2") int val2) {
		System.out.println("Calling addPost:" +val1+" val2: " +val2);
		int res= val1+val2;
		System.out.println("result:"  +res);
		return res;
	}

}
