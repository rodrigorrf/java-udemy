package sobrecarga.metodos;

public class Programa {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.calculaSalario(1000);
		System.out.println("Salario metodo 1: "  + f1.salario);
		
		f1.calculaSalario(1000, 2);		
		System.out.println("Salario metodo 2: "  + f1.salario);
		
		f1.calculaSalario();
		System.out.println("Salario metodo 3: "  + f1.salario);
	}
}
