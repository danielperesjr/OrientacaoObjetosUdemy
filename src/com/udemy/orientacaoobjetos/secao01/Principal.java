package com.udemy.orientacaoobjetos.secao01;

public class Principal {

    public static void main(String[] args){

        //Instância do obj1
        Conta obj1 = new Conta("123-4", 2000);
        System.out.println("Mostrando o Saldo Atual: R$" + obj1.getSaldo());
        System.out.println("Debitando R$100,00");
        obj1.debitar(100);
        System.out.println("Mostrando o Saldo Atual: R$" + obj1.getSaldo());
        System.out.println("Mostrando o Número da Conta: " + obj1.getNumero());

        System.out.println("==================================");
        
        //Instância do obj2
        Conta obj2 = new Conta("456-7", 6000);
        System.out.println("Mostrando o Saldo Atual: R$" + obj2.getSaldo());
        System.out.println("Debitando R$900,00");
        obj2.debitar(900);
        System.out.println("Mostrando o Saldo Atual: R$" + obj2.getSaldo());
        System.out.println("Mostrando o Número da Conta: " + obj2.getNumero());

    }
	
}