package com.isteak.appweb.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CODE;
	
	private String NOME;
	private String DESCRICAO;
	
	@Column(precision = 10, scale = 2)
    private BigDecimal PRECO;
	
	private int STATUS;
	private int QUANTIDADE;
	private byte[] FOTO;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date DATA_CADASTRO;
	
	@ManyToOne
	@JoinColumn(name = "TB_PRODUTO")
    private Categoria CODE_CATEGORIA;

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

	public String getDESCRICAO() {
		return DESCRICAO;
	}

	public void setDESCRICAO(String dESCRICAO) {
		DESCRICAO = dESCRICAO;
	}

	public BigDecimal getPRECO() {
		return PRECO;
	}

	public void setPRECO(BigDecimal pRECO) {
		PRECO = pRECO;
	}

	public int getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}

	public int getQUANTIDADE() {
		return QUANTIDADE;
	}

	public void setQUANTIDADE(int qUANTIDADE) {
		QUANTIDADE = qUANTIDADE;
	}

	public byte[] getFOTO() {
		return FOTO;
	}

	public void setFOTO(byte[] fOTO) {
		FOTO = fOTO;
	}

	public Date getDATA_CADASTRO() {
		return DATA_CADASTRO;
	}

	public void setDATA_CADASTRO(Date dATA_CADASTRO) {
		DATA_CADASTRO = dATA_CADASTRO;
	}

	public Categoria getCODE_CATEGORIA() {
		return CODE_CATEGORIA;
	}

	public void setCODE_CATEGORIA(Categoria cODE_CATEGORIA) {
		CODE_CATEGORIA = cODE_CATEGORIA;
	}
	
	
}
	
	
