package br.com.fiap.entity;

import java.io.Serializable;

public class LocacaoPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int cod;
	
	private int imovel;
	
	private int cliente;

	
	
	
	public LocacaoPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LocacaoPK(int cod, int imovel, int cliente) {
		super();
		this.cod = cod;
		this.imovel = imovel;
		this.cliente = cliente;
	}


	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getImovel() {
		return imovel;
	}

	public void setImovel(int imovel) {
		this.imovel = imovel;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cliente;
		result = prime * result + cod;
		result = prime * result + imovel;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocacaoPK other = (LocacaoPK) obj;
		if (cliente != other.cliente)
			return false;
		if (cod != other.cod)
			return false;
		if (imovel != other.imovel)
			return false;
		return true;
	}

	
	
	
	
}
