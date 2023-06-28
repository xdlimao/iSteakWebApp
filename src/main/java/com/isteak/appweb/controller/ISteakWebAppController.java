package com.isteak.appweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.isteak.appweb.model.AdmLogin;
import com.isteak.appweb.repository.AdmLoginRepository;

@Controller
@RequestMapping("")
public class ISteakWebAppController {
	
		@Autowired
		private AdmLoginRepository admLoginRepository;
	
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
		@GetMapping("/cadastro")
		public String getCadastro() {
			return "cadastro";
		}
		@GetMapping("/burro")
		public String getBurro() {
			return "burro";
		}
	    
		//Não sei se o controlador está funcionando, mas esse mesmo método
		//está no controller principal, depois vejo como fazer cada controlador
		//de cada classe independente funciona para não bagunçar o código.
		
		@GetMapping("/login")
	    public String exibirFormulario(Model model) {
	        model.addAttribute("admLogin", new AdmLogin());
	        return "login";
	    }
		
		@GetMapping("/loginerror")
	    public String exibirFormularioErro(Model model) {
	        model.addAttribute("admLogin", new AdmLogin());
	        return "loginerror";
	    }
		
	    @PostMapping("/formulario")
	    public String processarFormulario(@ModelAttribute("admLogin") AdmLogin admLogin) {
	    	AdmLogin admLoginFromDB = admLoginRepository.findByUSUARIO(admLogin.getUSUARIO());
	        if (admLoginFromDB != null && admLoginFromDB.getSENHA().equals(admLogin.getSENHA())) {
	            return "redirect:/dashboard";
	        } else {
	        	return "redirect:/loginerror";
	        }
	    }	    
}
