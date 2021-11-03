package br.com.baytebank.banco.teste;

public class TesteArrayDePrimitivos {

	//array []
	public static void main(String[] args) {
		
		int [] idades = new int[5]; // Inicializa o array com o 0
		
		for(int i = 0; i < idades.length;i++) {
			idades[i] = i * i;
		}
		for(int i = 0;i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
