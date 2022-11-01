package com.udemy.orientacao.objetos.secao01;

public class Conta {

	private String numero;
	private float saldo;

	public Conta(String numeroDaConta, float saldoInicial) {
		numero = numeroDaConta;
		saldo = saldoInicial;
	}

	public void debitar(float valor) {
		saldo = saldo - valor;
	}

	public void creditar(float valor) {
		saldo = saldo + valor;
	}

	public String getNumero() {
		return numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float novoSaldo) {
		saldo = novoSaldo;
	}

}