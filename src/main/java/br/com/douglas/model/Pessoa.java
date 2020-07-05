package br.com.douglas.model;

public class Pessoa {

	private String nome;
	private String sobrenome;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String sobrenome) {
		super();
		this.setNome(nome);
		this.setSobrenome(sobrenome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
}
