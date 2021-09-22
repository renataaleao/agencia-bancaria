package com.agencia.bancaria;

public abstract class Conta implements Tributo{
	
	private int agencia;
	private int conta;
	private String titular;
	private double saldo;
	
	public Conta(int agencia, int conta, String titular) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}
	
	public Conta(int agencia, int conta) {
		super();
		this.agencia = agencia;
		this.conta = conta;
	}
	
	public void depositar(double valor)  {
		if(valor > 0) {
			saldo += valor;	
		}
	}
	
	public final void transferir(Conta origem, Conta destino, double valor) {
		origem.sacar(valor);
		destino.depositar(valor);
	}

	public final void sacar(double valor) {
		if(valor > 0 && saldo >= valor) {
			saldo -= valor;	
		} 
	}

	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Dados da Conta: agencia=" + agencia + ", conta=" + conta + ", titular=" + titular;
	}
	
	
}
