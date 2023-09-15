package heranca;

	public class Fornecedor extends Pessoa {
		
		private float valorDivida;
		private float valorCredito;

		
		public Fornecedor() {
			super();
					
		}
		
		public Fornecedor(float valorCredito){
			super();
			this.valorCredito = valorCredito;
		}
		
		public Fornecedor(float valorCredito, float valorDivida, String nome, String endereco, String telefone) {
			super(nome, endereco, telefone);
			this.valorCredito = valorCredito;
			this.valorDivida = valorDivida;
			
		}
		

		public float getValorDivida() {
			return this.valorDivida;
		}

		public void setValorDivida(float valorDivida) {
			this.valorDivida = valorDivida;
		}

		public float getValorCredito() {
			return this.valorCredito;
		}

		public void setValorCredito(float valorCredito) {
			this.valorCredito = valorCredito;
		}
		 
		public float obterSaldo() {
			return (this.valorCredito - this.valorDivida);
		}
		
	  
	  public String toString() {
			return "Fornecedor [valorDivida=" + this.valorDivida + ", valorCredito=" + this.valorCredito + super.toString() +"]";
		}
	}

