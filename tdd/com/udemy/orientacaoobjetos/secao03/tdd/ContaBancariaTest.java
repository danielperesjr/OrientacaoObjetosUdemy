package com.udemy.orientacaoobjetos.secao03.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

import com.udemy.orientacaoobjetos.secao03.override.ContaBancaria;

public class ContaBancariaTest {

	@Test
	public void testaObjetoContaBancaria() {
		ContaBancaria contaCorrente = new ContaBancaria("Felicity Jones", 123, 2000);
		assertEquals("Felicity Jones", contaCorrente.getCliente());
		assertEquals(123, contaCorrente.getNumConta());
		assertEquals(2000, contaCorrente.getSaldo(), 0.000001);
	}

}
