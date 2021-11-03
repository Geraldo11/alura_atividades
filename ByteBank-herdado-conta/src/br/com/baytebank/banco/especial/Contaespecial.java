package br.com.baytebank.banco.especial;

import br.com.baytebank.banco.modelo.Conta;

public class Contaespecial extends Conta {

	public Contaespecial(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

}
