package com.udemy.orientacaoobjetos.secao03.associacoes;

public class ComposicaoBanco {
	
	private ComposicaoPoupanca[] pops;
	private ComposicaoContaCorrente[] cc;
	private int numConta, numPoupanca;
	
	public void iniciaBanco() {
		pops = new ComposicaoPoupanca[100];
		cc = new ComposicaoContaCorrente[100];
		numConta = 1;
		numPoupanca = 1;
	}
	
	public void abreConta() {
		cc[numConta] = new ComposicaoContaCorrente();
		numConta++;
	}
	
	public void abrePoupanca() {
		pops[numPoupanca] = new ComposicaoPoupanca();
		numPoupanca++;
	}
}
