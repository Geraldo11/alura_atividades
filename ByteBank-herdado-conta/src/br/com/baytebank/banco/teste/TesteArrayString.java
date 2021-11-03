package br.com.baytebank.banco.teste;

import br.com.baytebank.banco.modelo.Conta;
import br.com.baytebank.banco.modelo.ContaCorrente;
import br.com.baytebank.banco.modelo.ContaPoupanca;

public class TesteArrayString {

	public static void main(String[] args) {
		
		System.out.println("Funcionou!");
		
		for(int i =0; i< args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
