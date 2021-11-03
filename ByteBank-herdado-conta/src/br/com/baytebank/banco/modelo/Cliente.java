package br.com.baytebank.banco.modelo;

/**
 * Classe que representa um cliente no bytebank.
 * @author geral
 * @Vesion 1.0
 */
public class Cliente {

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	private String nome;
	private String cpf;
	private String profissao;
	
}
