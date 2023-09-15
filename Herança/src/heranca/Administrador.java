package heranca;

public class Administrador extends Empregado {
	
	private float ajudaDeCusto;
	
	public Administrador() {
		super();
	}
	
	public Administrador(float ajudaDeCusto, int codigoSetor, float salarioBase, float imposto, String nome, String endereco, String telefone) {
		super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
		
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public float salarioADM() {
		return (super.calcularSalario() + this.ajudaDeCusto);
	}

	public String toString() {
		return "Administrador [ajudaDeCusto=" + ajudaDeCusto + super.toString() +"]";
	}
	

}
