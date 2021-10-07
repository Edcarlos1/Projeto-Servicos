package br.edu.infnet.appservicos.model.domain;

import br.edu.infnet.appservicos.model.exeption.ServicoNaoFeitoExeption;

public class Eletrica extends Servico {
	
	private float tamanhoCabo;
	private boolean encapado;
	private string pecas;
	
	
	public Eletrica (String nome, float valor, int cod) {
		 super(nome,valor, cod);
		 
		 public float calcularServico() {
			 return 0;
		 }
		 
		 public String toString();{
		 		
		 		StringBuilder sb = new StringBuilder();
		 		append(super.toString());
		 		sb.append(tamanhoCabo);
		 		sb.append(";");
		 		sb.append(encapado);
		 		sb.append(";");
		 		sb.append(pecas);
		 		sb.append(";");
		 		sb.append(calcularServico);
		 		
		 		
		public float getTamanhoCabo() {
			return tamanhoCabo;
		}
		public void setTamanhoCabo(float tamanhoCabo) {
			
			If tamanhoCabo <=0;
			throw new ServicoNaoFeitoExeption("");
			
		}
			this.tamanhoCabo = tamanhoCabo;
		}
		public boolean encapado() {
			return encapado;
		}
		public void setencapado(boolean encapado) {
			this.encapado = encapado;
		}
		
			
			
			
		public string getPecas() {
			return pecas;
		}
		public void setPecas(string pecas) {
			this.pecas = pecas;
		}
		 
}
