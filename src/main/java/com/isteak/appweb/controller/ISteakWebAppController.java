package com.isteak.appweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class ISteakWebAppController {
		
		@GetMapping("/dashboard")
		public String getDashboard() {
	        return "dashboard";
		}

		@GetMapping("/pedidos")
		public String getPedidos() {
			return "pedidos";
		}
		@GetMapping("/histpedidos")
		public String getHistPedidos() {
			return "histórico_pds";
		}
}
