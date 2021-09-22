package com.agencia.bancaria;

public class ContaCorrente extends Conta {
	
	public static final double VALOR_TARIFA_CONTA_CORRENTE = 0.5;
	
	public ContaCorrente(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
	}
	
	@Override
	public void depositar(double valor) {
		valor = valor - getTributo();
		super.depositar(valor);
	}

	@Override
	public double getTributo() {
		return VALOR_TARIFA_CONTA_CORRENTE;
	}


	
}
