package com.udemy.orientacaoobjetos.secao03.associacoes;

public class ComposicaoContaCorrente {
	
	private float saldo;
	
	public void saque() {
		saldo -= 100.0f;
		System.out.println("Novo Saldo -> " + saldo);
	}
	
	public void deposito( ){
		saldo += 100.0f;
		System.out.println("Novo Saldo -> " + saldo);
	}
}