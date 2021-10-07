package br.edu.infnet.appservicos.model.domain;


public abstract class Servico {

		private String  nome;
		private float   valor;
		private int     cod;
		
		public Servico (String nome, float valor, int cod) {
			this.hidraulico = nome;
			this.valor = valor;
			this.cod = cod;
		}
		
		public abstract float calcularServico();
		
		
			public String toString() {
				
				StringBuilder sb  = new StringBuilder();
				sb.append(nome);
				sb.append(";");
				sb.append(valor);
				sb.append(";");
				sb.append(cod);
				sb.append(";");
				
				return sb.toString();
			}
			
			
		public String getHidraulico() {
			return hidraulico;
		}

		public float getValor() {
			return valor;
		}

		public int getCod() {
			return cod;
		}

		
		
		
			
		}
}
