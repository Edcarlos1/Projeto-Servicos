package br.edu.infnet.appservicos.model.teste;

import br.edu.infnet.appservicos.model.domain.Solicitacao;
import br.edu.infnet.appservicos.model.domain.Solicitante;

public class SolicitaçãoTeste {
	public static void main(String[] args) {
		
		Solicitante solicitante = new Solicitante("Ricardo", "123654987-11", "ricardo@ricardo.com")
		
		eletrica manutencao = new eletrica (troca, 50, 123);
				
		Solicitacao tubulacao = new solicitacao ();
		tubulacao.setDescricao("Troca de tubulação");
		tubulacao.setSolicitante(solicitante);
		System.out.println(tubulacao);
		
		
		Solicitacao eletrica = new solicitacao ();
		eletrica.setDescricao("Troca de cabos");
		eletrica.setSolicitante(solicitante);
		System.out.println(eletrica);
	}

}
