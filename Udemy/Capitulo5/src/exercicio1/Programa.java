package exercicio1;

public class Programa {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Rodrigo");
		funcionario.setRg("12345678-9");
		funcionario.setDataEntrada("29/03/1990");
		funcionario.setDepartamento("TI");
		funcionario.setEstaNaEmpresa(true);
		funcionario.setSalario(2000.0);
		
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("RG: " + funcionario.getRg());
		System.out.println("Data Entrada: " + funcionario.getDataEntrada());
		System.out.println("Departamento: " + funcionario.getDepartamento());
		System.out.println("Status: " + funcionario.isEstaNaEmpresa());
		System.out.println("Salario: " + funcionario.getSalario());
	}

}
