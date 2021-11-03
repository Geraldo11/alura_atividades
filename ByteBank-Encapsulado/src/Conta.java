public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private String titular;
	private static int total;
	
	public Conta (int agencia, int numero) {
		Conta.total++;
		System.out.println("o total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta" + this.numero);
	}
	
	public void deposita (double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
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
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
}

