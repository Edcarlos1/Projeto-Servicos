package br.edu.infnet.appservicos.model.domain;

public class Solicitante {

	
		private String nome;
		private String cpf;
		private String email;
		
		
		public Solicitante (String nome, String cpf, String email) {
			this.nome = nome;
			this.cpf  = cpf;
			this.email = email;
					
		}
			public String toString() {
				
				StringBuilder sb = new StringBuilder();
				sb.append(nome);
				sb.append(";");
				sb.append(cpf);
				sb.append(";");
				sb.append(email);
				
				return sb.substring();
							
			}
				
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
}
