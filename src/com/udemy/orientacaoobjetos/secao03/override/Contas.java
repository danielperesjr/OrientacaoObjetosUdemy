package com.udemy.orientacaoobjetos.secao03.override;

public class Contas {

	public static void main(String[] args) {
		
		ContaBancaria contaCorrente = new ContaBancaria("Felicity Jones", 123, 2000);
		contaCorrente.mostrarDadosDaConta();
		contaCorrente.depositar(1500);
		contaCorrente.mostrarDadosDaConta();
		contaCorrente.sacar(50500);
		contaCorrente.mostrarDadosDaConta();
		System.out.println("-------------------------");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca("Angelina Jolie", 456, 7000, 3);
		contaPoupanca.depositar(1500);
		contaPoupanca.mostrarDadosDaConta();
		contaPoupanca.calcularNovoSaldo(4);
		contaPoupanca.mostrarDadosDaConta();
		contaPoupanca.sacar(50500);
		contaCorrente.mostrarDadosDaConta();
		System.out.println("-------------------------");
		
		ContaEspecial contaEspecial = new ContaEspecial("Bruce Dickinson", 666, 8000, 1000);
		contaEspecial.depositar(1500);
		contaEspecial.mostrarDadosDaConta();
		contaEspecial.sacar(10000);
		contaEspecial.mostrarDadosDaConta();
		contaEspecial.sacar(10000);
		contaEspecial.mostrarDadosDaConta();

	}

}
