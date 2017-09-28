package br.com.bancoDeDadosFake.model.vo;

import java.util.List;

public class Carro {

	private int porta;
	private String cambio;
	private int chassi;
	private String modelo;
	private String cor;
	private List<Endereco> listaDeEndereco;

	public Carro(){
		
	}
	
	public Carro(int porta, 
			String cambio, 
			int chassi, 
			String modelo, 
			String cor, 
			List<Endereco> listaDeEndereco) {
		
		this.cambio = cambio;
		this.chassi = chassi;
		this.modelo = modelo;
		this.cor = cor;
		this.listaDeEndereco = listaDeEndereco;
	}

	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public List<Endereco> getListaDeEndereco() {
		return listaDeEndereco;
	}

	public void setListaDeEndereco(List<Endereco> listaDeEndereco) {
		this.listaDeEndereco = listaDeEndereco;
	}

	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	
}