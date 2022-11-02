package com.udemy.orientacaoobjetos.secao03.associacoes;

//Agregação

public class AgregacaoComprador {
	
	private float verba;
	
	public float getVerba() {
		return verba;
	}

	public void setVerba(float verba) {
		this.verba = verba;
	}
	
	public void compra() {
		System.out.println("Comprado!");
	}
	
}
