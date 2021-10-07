package br.edu.infnet.appservicos.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Solicitacao {

	private String descricao;
	private LocalDateTime data;
	private Solicitante solicitante;
	private Solicitacao solicitacao;
	private List<Servico> servicos;
	
	public Solicitacao() {
		data = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		
		DateTimeFormater formato = DateTimeFormater.ofPattern("dd/MM/yyyy HH:mm");
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(descricao);
		sb.append(";");
		sb.append(data.format(formato));
		sb.append(";");
		sb.append(solicitante);
		sb.append(Servicos.size());
		
	return sb.toString();
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Solicitante getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}
	
	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

}
