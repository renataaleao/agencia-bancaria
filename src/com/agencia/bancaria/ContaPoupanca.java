package com.agencia.bancaria;

public class ContaPoupanca extends Conta {

	private static final int VALOR_IMPOSTO_CONTA_POUPANCA = 1;
	
	public ContaPoupanca(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
		
	}

	@Override
	public double getTributo() {
		return VALOR_IMPOSTO_CONTA_POUPANCA;
	}


}
