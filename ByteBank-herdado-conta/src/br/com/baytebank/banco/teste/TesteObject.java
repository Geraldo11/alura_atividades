package br.com.baytebank.banco.teste;

import br.com.baytebank.banco.modelo.Cliente;
import br.com.baytebank.banco.modelo.ContaCorrente;
import br.com.baytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente (22, 33);
		Object cp = new ContaPoupanca(33, 22);
		Object cliente = new Cliente();
		
		//System.out.println(cliente);
		System.out.println(cc.toString());
		System.out.println(cp);
	}

}
