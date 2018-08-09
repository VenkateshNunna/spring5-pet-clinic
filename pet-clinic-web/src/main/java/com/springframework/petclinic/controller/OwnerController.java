package com.springframework.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.petclinic.services.OwnerService;

@Controller
@RequestMapping("/owner")
public class OwnerController {
	
	private OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}


	@RequestMapping({"","/","/index","/index.html"})
	public String ownerIndexPage(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "/owners/index";
	}
	
}
