package com.udemy.orientacaoobjetos.secao03.associacoes;

//Agregação

public class AgregacaoVendedor {

	private float comissao;
	
	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public void vende() {
		System.out.println("Vendido!");
	}
}
