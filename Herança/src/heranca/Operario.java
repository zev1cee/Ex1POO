package heranca;

public class Operario extends Empregado {
	
	private float valorProducao;
	private float comissao;
	
	public Operario() {
		super();
	}
	
	public Operario(float valorProducao, int comissao, int codigoSetor, float salarioBase, float imposto, String nome, String endereco, String telefone ) {
		super(codigoSetor, salarioBase, imposto, nome, endereco, telefone);
		
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public float getValorProducao() {
		return this.valorProducao;
	}

	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}

	public float getComissao() {
		return this.comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
	public float salarioOperario() {
		return (super.calcularSalario() + (this.valorProducao*(this.comissao/100)));
	}

	public String toString() {
		return "Operario [valorProducao=" + valorProducao + ", comissao=" + comissao + super.toString() + "]";
	}
	

}
