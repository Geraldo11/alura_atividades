
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		conta.deposita(200);
	
		System.out.println(Conta.getTotal());
	}
}
