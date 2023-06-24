package com.isteak.appweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ADMLOGIN")
public class AdmLogin {

	@Id
	private String USUARIO;
	private String SENHA;
	public String getUSUARIO() {
		return USUARIO;
	}
	public void setUSUARIO(String uSUARIO) {
		USUARIO = uSUARIO;
	}
	public String getSENHA() {
		return SENHA;
	}
	public void setSENHA(String sENHA) {
		SENHA = sENHA;
	}
	
	
}
