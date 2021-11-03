package br.com.baytebank.banco.teste;

import br.com.baytebank.banco.especial.Contaespecial;
import br.com.baytebank.banco.modelo.*;

public class TesteContas {

	public static void main(String[] args) {

				
		ContaCorrente cc = new ContaCorrente (111, 222);
		cc.deposita(100.0);
		//Full qualified name FQN
		ContaPoupanca cp = new ContaPoupanca (115, 114);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		

	}

}
