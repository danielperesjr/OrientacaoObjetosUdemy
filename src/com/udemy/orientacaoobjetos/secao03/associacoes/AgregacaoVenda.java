package com.udemy.orientacaoobjetos.secao03.associacoes;

//Agregação

public class AgregacaoVenda {
	private AgregacaoComprador c;
	private AgregacaoVendedor v;
	private AgregacaoProduto p;
	
	public void concretizaVenda() {
		System.out.println("Venda efetuada!");
		c.setVerba(c.getVerba() - p.getPreco());
		v.setComissao(v.getComissao() + (p.getPreco() * 0.1f));
		p.vendido();
	}
	
	public void cancelaVenda() {
		System.out.println("Venda cancelada!");
	}
}
