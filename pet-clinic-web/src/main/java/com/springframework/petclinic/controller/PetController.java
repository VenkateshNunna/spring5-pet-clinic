package com.springframework.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {

	@RequestMapping({"","/","/index","/index.html"})
	public String petIndex() {
		return "index";
	}
	
}
