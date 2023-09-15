package heranca;

public class Pessoa {
	
		private String nome;
		private String endereco;
		private String telefone;
		
		
		public Pessoa() {
		
			
		}

		public Pessoa(String nome, String endereco, String telefone ){
			this.nome = nome;
			this.endereco = endereco;
			this.telefone = telefone;
			
		}
		
		public Pessoa(String nome, String telefone ){
			this.nome = nome;
			this.telefone = telefone;
			
		}
		
		
		public String toString() {
			return "nome:" +  this.nome + "endereço:" + this.endereco + "tel:" + this.telefone;
			
		}
		
		public void setNome (String nome) {
			this.nome = nome;
		}
		
		public void setEndereco (String endereco) {
			this.endereco = endereco;
		}
		
		public void setTelefone (String telefone) {
			this.telefone = telefone;
		}
		
		
		public String getNome() {
			return this.nome;
		}
		
		public String getEndereco() {
			return this.endereco;
		}
		
		public String getTelefone() {
			return this.telefone;
		}
		
	}


