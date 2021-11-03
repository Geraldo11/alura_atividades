
public class TesteConexao {

	public static void main(String[] args) {
		
		
		try (Conexao conexao = new Conexao ()) {
			
			conexao.LeDados();
		}catch (IllegalStateException ex) {
			System.out.println("deu erro na conexao");
		}
		
		
		//Conexao con =null;

		//try {
			//con = new Conexao ();
			//con.LeDados();
		//}catch (IllegalStateException ex) {
			//System.out.println("Deu erro na conexão");
		//}finally {
			//System.out.println("Finally");
			//if(con != null) {
				//con.close();
			//}
		//}

	}

}
