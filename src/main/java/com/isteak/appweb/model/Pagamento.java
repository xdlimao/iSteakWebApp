package com.isteak.appweb.model;

import java.util.Date;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_PAGAMENTO")
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CODE;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date DATA_PAGAMENTO;
	
	private String APELIDO_CARTAO;
	private String NUMERO_CARTAO;
	private String VALIDADE;
	private String CVV;
	private String NOME_TITULAR;
	private String CPF_TITULAR;
	private int STATUS;
	
	@ManyToOne
	@JoinColumn(name="TB_CLIENTE")
	private Cliente CODE_CLIENTE;


	public int getCODE() {
		return CODE;
	}

	public void setCODE(int cODE) {
		CODE = cODE;
	}

	public Date getDATA_PAGAMENTO() {
		return DATA_PAGAMENTO;
	}

	public void setDATA_PAGAMENTO(Date dATA_PAGAMENTO) {
		DATA_PAGAMENTO = dATA_PAGAMENTO;
	}

	public String getAPELIDO_CARTAO() {
		return APELIDO_CARTAO;
	}

	public void setAPELIDO_CARTAO(String aPELIDO_CARTAO) {
		APELIDO_CARTAO = aPELIDO_CARTAO;
	}

	public String getNUMERO_CARTAO() {
		return NUMERO_CARTAO;
	}

	public void setNUMERO_CARTAO(String nUMERO_CARTAO) {
		NUMERO_CARTAO = nUMERO_CARTAO;
	}

	public String getVALIDADE() {
		return VALIDADE;
	}

	public void setVALIDADE(String vALIDADE) {
		VALIDADE = vALIDADE;
	}

	public String getCVV() {
		return CVV;
	}

	public void setCVV(String cVV) {
		CVV = cVV;
	}

	public String getNOME_TITULAR() {
		return NOME_TITULAR;
	}

	public void setNOME_TITULAR(String nOME_TITULAR) {
		NOME_TITULAR = nOME_TITULAR;
	}

	public String getCPF_TITULAR() {
		return CPF_TITULAR;
	}

	public void setCPF_TITULAR(String cPF_TITULAR) {
		CPF_TITULAR = cPF_TITULAR;
	}

	public int getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}

	public Cliente getCODE_CLIENTE() {
		return CODE_CLIENTE;
	}

	public void setCODE_CLIENTE(Cliente cODE_CLIENTE) {
		CODE_CLIENTE = cODE_CLIENTE;
	}
	
	
}
