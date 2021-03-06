package entidades;

import exceptions.BusinessException;

public class Conta {
	private Integer numero;
	private String nome;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
		
	}

	public Conta(Integer numero, String nome, Double saldo, Double limiteSaque) {
		
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	public void depositar(double quantia) {
		saldo = saldo + quantia;
	}

	public void saque(double quantia) {
		validarSaque(quantia);
		saldo= saldo - quantia;
	}
	private void validarSaque(double quantia) {
		if(quantia > getLimiteSaque()) {
			throw new BusinessException("Erro: A quantia excede o limite de saque");
		}
	   if(quantia > getSaldo()) {
			throw new BusinessException( "Saldo insuficiente");
		}
	   
	}
	
}
