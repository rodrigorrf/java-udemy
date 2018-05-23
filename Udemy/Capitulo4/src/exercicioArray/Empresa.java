package exercicioArray;

public class Empresa {
	String razaoSocial;
	String cnpj;
	
	Funcionario funcionarios[];
	
	public void adicionaFuncionario(Funcionario funcionario) {
		
		for(int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] == null) {
				funcionarios[i] = funcionario;
				System.out.println("INDICE: " + i);
				/*funcionarios[i].salario = funcionario.salario;
				funcionarios[i].dataEntrada = funcionario.dataEntrada;
				funcionarios[i].rg = funcionario.rg;
				funcionarios[i].estaNaEmpresa = funcionario.estaNaEmpresa;*/
				break;
			}
		}
	}

}
