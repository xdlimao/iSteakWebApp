package com.isteak.appweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


//Infelizmente, não faço ideia do porque não retornar a página, vou verificar no código da escola.
@Controller
@RequestMapping("/api")
public class ISteakWebAppController {
		
		@GetMapping("/db1")
		public String getDashboard() {
	        return "dashboard";
		}
}
