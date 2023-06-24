package com.isteak.appweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isteak.appweb.model.Administrador;
import com.isteak.appweb.service.AdministradorService;

@RestController
@RequestMapping("/api/administrador")
public class AdministradorController {
//peralta
	//peralta2
	//peralta3
	@Autowired
	private AdministradorService administradorService;

	@PostMapping
	public ResponseEntity<Administrador> salvarAdministrador(@RequestBody Administrador admin) {
		Administrador adminSalva = administradorService.salvarAdministrador(admin);
		return ResponseEntity.ok(adminSalva);
	}
	
	@GetMapping
	public ResponseEntity<List<Administrador>> listarAdministrador() {
		List<Administrador> admin = administradorService.listarAdministrador();
		return ResponseEntity.ok(admin);
		}
	
	@DeleteMapping
	public ResponseEntity<Void>excluirAdministrador(@PathVariable Integer id){
		administradorService.excluirAdministrador(id);
		return ResponseEntity.noContent().build();
	}
}
