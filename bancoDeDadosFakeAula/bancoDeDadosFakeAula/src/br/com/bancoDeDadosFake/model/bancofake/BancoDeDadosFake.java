package br.com.bancoDeDadosFake.model.bancofake;

import java.util.ArrayList;
import java.util.List;

import br.com.bancoDeDadosFake.model.vo.Contato;

public class BancoDeDadosFake {

	private static List<Carro> banco;
	
	private BancoDeDadosFake(){
		
	}
	
	public static List<Carro> getInstance(){
		if(banco==null){
			banco = new ArrayList<Carro>();
		}
		return banco;
	}
	
	
	
}
