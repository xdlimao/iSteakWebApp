package com.isteak.appweb.model;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_PEDIDO")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CODE;
	
	private int STATUS;
	
	@Column(precision = 10, scale = 2)
    private BigDecimal VALOR;
	
	@ManyToOne
	@JoinColumn(name="TB_CLIENTE")
	private Cliente CODE_CLIENTE;
	
	//@ManyToMany
	//@JoinColumn(name="TB_PRODUTO")
	//private Produto CODE_PRODUTO;
	//Removi o Getters e Setters também.
	
	@ManyToOne
	@JoinColumn(name="TB_PAGAMENTO")
	private Pagamento CODE_PAGAMENTO;


	public int getCODE() {
		return CODE;
	}

	public void setCODE(int cODE) {
		CODE = cODE;
	}

	public int getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}

	public BigDecimal getVALOR() {
		return VALOR;
	}

	public void setVALOR(BigDecimal vALOR) {
		VALOR = vALOR;
	}

	public Cliente getCODE_CLIENTE() {
		return CODE_CLIENTE;
	}

	public void setCODE_CLIENTE(Cliente cODE_CLIENTE) {
		CODE_CLIENTE = cODE_CLIENTE;
	}

	public Pagamento getCODE_PAGAMENTO() {
		return CODE_PAGAMENTO;
	}

	public void setCODE_PAGAMENTO(Pagamento cODE_PAGAMENTO) {
		CODE_PAGAMENTO = cODE_PAGAMENTO;
	}
	
	
}
