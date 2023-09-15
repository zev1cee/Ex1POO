package heranca;

public class Vendedor extends Empregado {

	private float valorVendas;
	private float comissaoVendedor;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(float valorVendas, int comissaoVendedor, int codigoSetor, float salarioBase, float imposto, String nome, String endereco, String telefone) {
		super(codigoSetor, salarioBase, imposto, nome, endereco, telefone );
		this.valorVendas = valorVendas;
		this.comissaoVendedor = comissaoVendedor;
	}

	public float getValorVendas() {
		return this.valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

	public float getComissaoVendedor() {
		return this.comissaoVendedor;
	}

	public void setComissaoVendedor(float comissaoVendedor) {
		this.comissaoVendedor = comissaoVendedor;
	}
	
	public float salarioVendedor() {
		return(super.calcularSalario() + (this.valorVendas*(this.comissaoVendedor/100)));
	}

	public String toString() {
		return "Vendedor [valorVendas=" + valorVendas + ", comissaoVendedor=" + comissaoVendedor + super.toString() + "]";
	}
	
	
	
	
}
