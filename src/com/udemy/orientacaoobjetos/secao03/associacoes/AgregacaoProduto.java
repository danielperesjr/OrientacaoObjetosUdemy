package com.udemy.orientacaoobjetos.secao03.associacoes;

//Agregação

public class AgregacaoProduto {

	private float preco;
	private int tamanho;
	
	
	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void vendido() {
		System.out.println("Vendido!");
	}
}
