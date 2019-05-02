package br.com.testcontroller.entity;

public class Sistema {

	private int codigo;

	private String nome;

	public Sistema() {

	}

	public Sistema(int codigo, String nome) {

		this.codigo = codigo;
		this.nome = nome;
	}

	public Sistema(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
