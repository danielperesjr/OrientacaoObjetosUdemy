package com.udemy.orientacaoobjetos.secao03.arrays;

import com.udemy.orientacaoobjetos.secao01.Conta;

public class UtilitarioContas {

	public void imprimirContas(Conta[] contas) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				System.out.println("Número da conta: " + contas[i].getNumero() + " Saldo: " + contas[i].getSaldo());
			}
		}
	}

	public void somarSaldos(Conta[] contas) {
		float saldoTotal = 0.0f;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				saldoTotal =  saldoTotal  + contas[i].getSaldo();
			}
		}
		System.out.println("O  saldo total é: " + saldoTotal);
	}

}
