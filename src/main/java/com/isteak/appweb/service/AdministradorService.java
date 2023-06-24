package com.isteak.appweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isteak.appweb.model.Administrador;
import com.isteak.appweb.repository.AdministradorRepository;

@Service
public class AdministradorService {

	//LEMBRANDO QUE O SISTEMA DE LOGIN VAI SER PARECIDO COMO UM ROTEADOR DE WI-FI
	//UM ÚNICO LOGIN MESTRE QUE PODE SE ALTERAR A SENHA
	
	@Autowired
	private AdministradorRepository administradorRepository;
	
	public Administrador salvarAdministrador(Administrador admin) {
		 return administradorRepository.save(admin);
		 }
	
	public List<Administrador> listarAdministrador() {
		 return administradorRepository.findAll();
		 }
	
	public void excluirAdministrador(Integer id) {
		administradorRepository.deleteById(id);
		 }
	
}