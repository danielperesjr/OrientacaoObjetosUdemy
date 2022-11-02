package com.udemy.orientacaoobjetos.secao03.arrays;

import com.udemy.orientacaoobjetos.secao01.Conta;

public class PrincipalContas {

	public static void main(String[] args) {
		
		Conta contas[] = new Conta[100];
		
		contas[0] = new Conta("1234", 234);
		contas[0].creditar(50);
		
		contas[1] = new Conta("53412", 4325);
		contas[1].debitar(50);
		
		contas[2] = new Conta("986", 925);
		contas[2].debitar(100);
		
		UtilitarioContas uc = new UtilitarioContas();
		
		uc.imprimirContas(contas);
		uc.somarSaldos(contas);
		
//		System.out.println("Número da conta: " + c[0].getNumero() + " Saldo da Conta: " + c[0].getSaldo());
//		System.out.println("Número da conta: " + c[1].getNumero() + " Saldo da Conta: " + c[1].getSaldo());
	}
	
}
