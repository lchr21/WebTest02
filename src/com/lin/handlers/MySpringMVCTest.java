package com.lin.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MySpringMVCTest {
	
	@RequestMapping("/testSpringMvc")
	public String testSpringMvc(){
		System.out.println("hello");
		return "success";
	}
}
