package com.udemy.orientacaoobjetos.secao03.associacoes;

public class ComposicaoPoupanca {
	
	private float saldo;
	
	public void saque() {
		saldo -= 10.0f;
		System.out.println("Novo Saldo -> " + saldo);
	}
	
	public void deposito() {
		saldo += 10.0f;
		System.out.println("Novo Saldo -> " + saldo);
	}
}
