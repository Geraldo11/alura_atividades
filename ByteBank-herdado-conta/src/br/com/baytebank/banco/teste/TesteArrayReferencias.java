package br.com.baytebank.banco.teste;

import br.com.baytebank.banco.modelo.Conta;
import br.com.baytebank.banco.modelo.ContaCorrente;
import br.com.baytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object [] Referencias = new Object [5];
		
		ContaCorrente cc1 = new ContaCorrente(222, 333);
		
		Referencias[0] = cc1;
		
		ContaPoupanca cp2 = new ContaPoupanca(223, 332);
		
		Referencias[1] = cp2;
		
		//System.out.println(cc2.getNumero());

		//ContaCorrente cc1 = new ContaCorrente(222, 333);System.out.println(Referencias[0].getNumero());
		ContaPoupanca ref = (ContaPoupanca) Referencias [1]; //type cast
		System.out.println(cp2.getNumero());
		System.out.println(ref.getNumero());
	}

}
