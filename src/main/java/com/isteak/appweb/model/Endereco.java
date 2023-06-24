package com.isteak.appweb.model;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ENDERECO")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CODE;
	
	@OneToOne
    @JoinColumn(name = "TB_CLIENTE")
    private Cliente CLIENTE_CODE;
	
	private String TIPO;
	private String RUA;
	private String NUMERO;
	private String COMPLEMENTO;
	private String BAIRRO;
	private String CIDADE;
	private String ESTADO;
	private String CEP;

	public int getCODE() {
		return CODE;
	}
	public void setCODE(int cODE) {
		CODE = cODE;
	}
	public Cliente getCLIENTE_CODE() {
		return CLIENTE_CODE;
	}
	public void setCLIENTE_CODE(Cliente cLIENTE_CODE) {
		CLIENTE_CODE = cLIENTE_CODE;
	}
	public String getTIPO() {
		return TIPO;
	}
	public void setTIPO(String tIPO) {
		TIPO = tIPO;
	}
	public String getRUA() {
		return RUA;
	}
	public void setRUA(String rUA) {
		RUA = rUA;
	}
	public String getNUMERO() {
		return NUMERO;
	}
	public void setNUMERO(String nUMERO) {
		NUMERO = nUMERO;
	}
	public String getCOMPLEMENTO() {
		return COMPLEMENTO;
	}
	public void setCOMPLEMENTO(String cOMPLEMENTO) {
		COMPLEMENTO = cOMPLEMENTO;
	}
	public String getBAIRRO() {
		return BAIRRO;
	}
	public void setBAIRRO(String bAIRRO) {
		BAIRRO = bAIRRO;
	}
	public String getCIDADE() {
		return CIDADE;
	}
	public void setCIDADE(String cIDADE) {
		CIDADE = cIDADE;
	}
	public String getESTADO() {
		return ESTADO;
	}
	public void setESTADO(String eSTADO) {
		ESTADO = eSTADO;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	
	
}
