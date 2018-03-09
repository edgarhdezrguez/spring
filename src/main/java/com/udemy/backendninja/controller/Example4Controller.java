package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/example")
public class Example4Controller {

	public static final String BASIC_VIEW = "example4";
	
	@GetMapping("/exampleNF")
	public ModelAndView example4() {
		ModelAndView mav = new ModelAndView(BASIC_VIEW);
		mav.addObject("name", "Mike");
		return mav;
	}
}
