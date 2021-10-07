package br.edu.infnet.appservicos.model.domain;

public class Hidraulico extends Servico {
	
	private boolean troca;
	private float tamanho;
	private String marca;
	
	
	public boolean isTroca() {
		return troca;
	}

	 public Hidraulico (String nome, float valor, int cod) {
		 super(nome,valor, cod);
		 
		 
	 public float calcularServico();{
		 return 100;
		 	
	 }
	 	
	 	public String toString();{
	 		
	 		StringBuilder sb = new StringBuilder();
	 		append(super.toString());
	 		sb.append(troca);
	 		sb.append(";");
	 		sb.append(tamanho);
	 		sb.append(";");
	 		sb.append(marca);
	 		sb.append(";");
	 		sb.append(calcularServico);
	 		
	 		
	 	}
	 	


	public void setTroca(boolean troca) {
		this.troca = troca;
	}




	public float getTamanho() {
		return tamanho;
	}




	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}





	 
	 
 }
}