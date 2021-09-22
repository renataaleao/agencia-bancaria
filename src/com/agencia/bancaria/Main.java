package com.agencia.bancaria;

public class Main {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente(1, 12345, "Renata");
		System.out.println(conta1);
		conta1.sacar(100);
	}

}
