package com.springframework.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.petclinic.services.VetService;

@Controller
@RequestMapping("/vet")
public class VetController {

	private VetService vetService;
	
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}


	@RequestMapping({"","/","/index","/index.html"})
	public String vetIndexPage(Model model) {
		model.addAttribute("vets",vetService.findAll());
		return "/vets/index";
	}
	
}
