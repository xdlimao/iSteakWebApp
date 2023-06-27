package com.isteak.appweb.model;

import java.util.Date;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CODE;
	
	private String NOME; 
	private int TELEFONE_DDD; 
	private Long TELEFONE_NUMERO; 
	private String EMAIL; 
	private String SENHA; 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date DATA_NASC;
	 
	private String CPF;  
	private String SEXO;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date DATA_CADASTRO;


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

	public String getSENHA() {
		return SENHA;
	}

	public void setSENHA(String sENHA) {
		SENHA = sENHA;
	}

	public Date getDATA_NASC() {
		return DATA_NASC;
	}

	public void setDATA_NASC(Date mDATA_NASC) {
		this.DATA_NASC = mDATA_NASC;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getSEXO() {
		return SEXO;
	}

	public void setSEXO(String sEXO) {
		SEXO = sEXO;
	}

	public Date getDATA_CADASTRO() {
		return DATA_CADASTRO;
	}

	public void setDATA_CADASTRO(Date mDATA_CADASTRO) {
		this.DATA_CADASTRO = mDATA_CADASTRO;
	}
	
	
}
