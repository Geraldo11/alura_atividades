
public class Conexao implements AutoCloseable {

	public Conexao() {
		System.out.println("abrindo conexao");
		throw new IllegalStateException();
	}
	
	public void LeDados () {
		System.out.println("Recebendo Dados");
		throw new IllegalStateException();
	}

	@Override
	public void close() {
		System.out.println("Fechando conexaos");
		
	}
}
