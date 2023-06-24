package com.isteak.appweb.model;

import java.util.UUID;
import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ADMINISTRADOR")
public class Administrador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CODE;
	
	private String NOME;
	private int TELEFONE_DDD;
	private Long TELEFONE_NUMERO;
	private String EMAIL;
	private String VARCHAR;
	private int STATUS;
	
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
	
	public int getTELEFONE_DDD() {
		return TELEFONE_DDD;
	}
	public void setTELEFONE_DDD(int tELEFONE_DDD) {
		TELEFONE_DDD = tELEFONE_DDD;
	}
	
	public Long getTELEFONE_NUMERO() {
		return TELEFONE_NUMERO;
	}
	public void setTELEFONE_NUMERO(Long tELEFONE_NUMERO) {
		TELEFONE_NUMERO = tELEFONE_NUMERO;
	}
	
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	
	public String getVARCHAR() {
		return VARCHAR;
	}
	public void setVARCHAR(String vARCHAR) {
		VARCHAR = vARCHAR;
	}
	
	public int getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}


}
