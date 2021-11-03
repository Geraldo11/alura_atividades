package br.com.baytebank.banco.teste;

import br.com.baytebank.banco.modelo.CalculadorDeImposto;
import br.com.baytebank.banco.modelo.ContaCorrente;
import br.com.baytebank.banco.modelo.SeguroDeVida;

public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222,333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
