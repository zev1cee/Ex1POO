package heranca;

	public class Empregado extends Pessoa {
		
		private int codigoSetor;
		private float salarioBase;
		private float imposto;
		
		public Empregado() {
			super();
		}
		
		public Empregado(int codigoSetor, float salarioBase, float imposto, String nome, String endereco, String telefone) {
			super(nome, endereco,telefone);
			
			this.codigoSetor = codigoSetor;
			this.salarioBase = salarioBase;
			this.imposto = imposto;
		}

		public int getCodigoSetor() {
			return this.codigoSetor;
		}

		public void setCodigoSetor(int codigoSetor) {
			this.codigoSetor = codigoSetor;
		}

		public float getSalarioBase() {
			return this.salarioBase;
		}

		public void setSalarioBase(float salarioBase) {
			this.salarioBase = salarioBase;
		}

		public float getImposto() {
			return this.imposto;
		}

		public void setImposto(float imposto) {
			this.imposto = imposto;
		}
		
		public float calcularSalario() {
			return (this.salarioBase - this.salarioBase * (this.imposto/100));
		}

		public String toString() {
			return "Empregado [codigoSetor=" + codigoSetor + ", salarioBase=" + salarioBase + ", imposto=" + imposto
					+ super.toString() +"]";
		}
		
		
		
		
		
		

	}


