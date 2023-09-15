package heranca;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa jose = new Pessoa("jose  ","rua  ","123  ");
		
		System.out.println(jose.toString());
		System.out.println(jose.getNome());
		
		Fornecedor um = new Fornecedor(5000, 2000, "cagadinho","rua1","73428276");
		
		System.out.println(um.toString());
		System.out.println("Saldo: " + um.obterSaldo());
		
		Empregado jamal = new Empregado(7, 6000, 5, "jamal  ","ruaX ","00000000  ");
		
		System.out.println(jamal.toString());
		System.out.println("Calculo salario: " + jamal.calcularSalario());
		
		Administrador caio = new Administrador(500, 7, 6000, 5, "caio  ","ruaC ","11111111  " );
		
		System.out.println(caio.toString());
		System.out.println("Salario ADM:" + caio.salarioADM());
		
		Operario jonathas = new Operario(5000, 5, 7, 6000, 5, "jonathas  ","ruaJ ","22222222  ");
		
		System.out.println(jonathas.toString());
		System.out.println("Salario Operario: " + jonathas.salarioOperario());
		
		Vendedor luis = new Vendedor(3000F, 5, 7, 6000F, 5F, "luis  ","ruaL ","33333333  ");
		
		System.out.println(luis.toString());
		System.out.println("Salario Vendedor: " + luis.salarioVendedor());
		
		

	}
	
	
	
	

}
