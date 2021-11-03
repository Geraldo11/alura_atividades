package br.com.alura.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerialização {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//String nome = "Geraldo Batista";
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Objeto.bin"));
		//oos.writeObject(nome);
		//oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Objeto.bin"));
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);
		
	}

}
