package br.com.baytebank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca (int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	public String toString() {
		return "Conta Poupanca, " + super.toString();
	}
}
