package br.com.bancoDeDadosFake.model.teste;

import br.com.bancoDeDadosFake.model.bancofake.BancoDeDadosFake;
import br.com.bancoDeDadosFake.model.vo.Carro;

public class TesteCarroBancoDeDados {
	
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.setNome("Teste1");
		
		Carro carro2 = new Carro();
		carro2.setNome("Teste2");
		
		Carro carro3 = new Carro();
		carro3.setNome("Teste3");
		
		BancoDeDadosFake.getInstance().add(carro1);
		BancoDeDadosFake.getInstance().add(carro2);
		BancoDeDadosFake.getInstance().add(carro3);

		for(Carro BancoDeDadosFake.getInstance()){
			Carro c;
			System.out.println("O Nome do carro é"+
								c.getNome());
		}

	}
}