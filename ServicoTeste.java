package br.edu.infnet.appservicos.model.teste;

import br.edu.infnet.appservicos.model.domain.Hidraulico;

public class ServicoTeste {
	
	public static void main(String[] args) {
		
		Hidraulico hidraulico = new Hidraulico ("Oleo", 50, "Lubrax");
		
		
		
		hidraulico.setTroca(true);
		hidraulico.setTamanho(100);
		hidraulico.setMarca(Lubrax);
		System.out.println(hidraulico);
		
		
	}

}
