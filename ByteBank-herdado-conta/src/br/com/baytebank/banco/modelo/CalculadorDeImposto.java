package br.com.baytebank.banco.modelo;

//br.com.baytebank.banco.modelo.CalculadorDeImposto => FQN
public class CalculadorDeImposto {

	private double totalImposto;
	public void registra (tributavel t) {
		double valor = t.getValorImposto();	
		this.totalImposto += valor;		
}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}