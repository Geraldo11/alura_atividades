package br.com.baytebank.banco.modelo;


/**
 * Classe representa a moldura de uma conta
 * @author Geraldo
 *
 */
public abstract class Conta extends Object implements Comparable<Conta> {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * @param agencia
	 * @param numero
	 */
	
	public Conta (int agencia, int numero) {
		Conta.total++;
		//System.out.println("o total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta" + this.numero);
	}
	
	public abstract void deposita (double valor);
	
	public void saca (double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + "valor: " + valor);
		} 
		
		this.saldo -= valor;
	}
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
			return false;
	}
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero (int Numero) {
		if(numero <= 0) {
			System.out.println("não pode valor <= 0");
			return;
		}
		this.numero = Numero;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente clienteCC2) {
		this.titular = clienteCC2;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public boolean equals (Object ref) {
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
	return  "numero:  " + this.numero + " Agencia: " + this.agencia + "Saldo: " + this.saldo;
	}
}


