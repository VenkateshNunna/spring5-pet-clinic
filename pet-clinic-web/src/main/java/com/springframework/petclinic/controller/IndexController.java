package com.springframework.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping({"/owners/find","/oups"})
	public String oops() {
		return "notimplemented";
	}
	
}
