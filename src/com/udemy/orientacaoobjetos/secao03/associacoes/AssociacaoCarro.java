package com.udemy.orientacaoobjetos.secao03.associacoes;

//Associação

@SuppressWarnings("unused")
public class AssociacaoCarro {
	private AssociacaoPneu p1;
	private AssociacaoPneu p2;
	private AssociacaoPneu p3;
	private AssociacaoPneu p4;
	
	public void liga() {
		System.out.println("Carro ligado!");
	}
	
	public void desliga() {
		System.out.println("Carro desligado!");
	}
}
