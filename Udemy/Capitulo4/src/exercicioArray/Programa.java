package exercicioArray;

public class Programa {

	public static void main(String[] args) {	
		Empresa empresa = new Empresa();
		
		empresa.razaoSocial = "TI";
		empresa.cnpj = "123456789";
		
		empresa.funcionarios = new Funcionario[3];
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Rodrigo";
		f1.departamento = "TI";
		f1.salario = 500.0;
		f1.dataEntrada = "21/05/2010";
		f1.rg ="1234567";
		f1.estaNaEmpresa= true;
		empresa.adicionaFuncionario(f1);
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Roberto";
		f2.departamento = "RH";
		f2.salario = 100.0;
		f2.dataEntrada = "21/05/2010";
		f2.rg ="7654321";
		f2.estaNaEmpresa= true;
		empresa.adicionaFuncionario(f2);
		
		Funcionario f3 = new Funcionario();
		f3.nome = "Ramos";
		f3.departamento = "PROD";
		f3.salario = 200.0;
		f3.dataEntrada = "07/07/2010";
		f3.rg ="123456789";
		f3.estaNaEmpresa= true;
		empresa.adicionaFuncionario(f3);
		
		System.out.println("RAZAO SOCIAL: " + empresa.razaoSocial);
		System.out.println("CNPJ: " + empresa.cnpj);
		
		for(Funcionario f : empresa.funcionarios) {
			System.out.println(f);
			System.out.println(f.nome);
			System.out.println(f.departamento);
			
		}
	}

}
