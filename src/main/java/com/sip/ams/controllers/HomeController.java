package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/info") // ce que je tape dans l'url
	public String info()
	{
		return "home/info"; // le nom du fichier sous templates /home
	}
	
	@RequestMapping("/affichage")
	public String affichage()
	{
		System.out.println("Méthode affichage");
		return "home/affichage";
	}
	
}
