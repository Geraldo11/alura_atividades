package br.com.alura.io.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializaçãoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Cliente cliente = new Cliente ();
		cliente.setNome("Geraldo");
		cliente.setProfissao("Dev");
		cliente.setCpf("2551513613");
		
	
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
		
		//ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Objeto.bin"));
		//String nome = (String) ois.readObject();
		//ois.close();
		//System.out.println(nome);
		
	}

}
