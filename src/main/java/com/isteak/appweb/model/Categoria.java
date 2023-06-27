package com.isteak.appweb.model;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_CATEGORIA")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CODE;

	private String NOME;


	public int getCODE() {
		return CODE;
	}

	public void setCODE(int cODE) {
		CODE = cODE;
	}

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String nOME) {
		NOME = nOME;
	}
	
	
}
