package polimorfismo;

public class Programa {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();		
		func.setNome("Rodrigo");
		func.setRg("12345678-9");
		func.setDataEntrada("29/03/2000");
		func.setDepartamento("TI");
		func.setEstaNaEmpresa(true);
		func.setSalario(1300.0);
		
		Gerente ger = new Gerente();
		ger.departamento = "Vendas";
		ger.dataEntrada = "20/20/2001";
		ger.estaNaEmpresa = true;
		ger.nome = "Roberto";
		ger.salario = 3500.0;
		ger.rg = "20";
		ger.setLogin("rf");
		ger.setSenha("123");
		ger.autentica("rf", "123");	
		
		Supervisor supervisor = new Supervisor();
		supervisor.salario = 5000;
		
		
		ControleDeBonificacao controle = new ControleDeBonificacao();
		controle.calculaTotalDeBonus(func);
		controle.calculaTotalDeBonus(ger);
		controle.calculaTotalDeBonus(supervisor);
		
		System.out.println("Nome: " + func.getNome());
		System.out.println("RG: " + func.getRg());
		System.out.println("Data de Entrada: " + func.getDataEntrada());
		System.out.println("Departamento: " + func.getDepartamento());
		System.out.println("Esta na Empresa: " + func.isEstaNaEmpresa());
		System.out.println("Salario: " + func.getSalario());
		System.out.println("Ganho anual: " + func.calculaGanhoAnual());
		System.out.println("Bonificação: "+func.bonifica());
		
		System.out.println("==============================================================");
		
			
		System.out.println("Nome: " + ger.getNome());
		System.out.println("RG: " + ger.getRg());
		System.out.println("Data de Entrada: " + ger.getDataEntrada());
		System.out.println("Departamento: " + ger.getDepartamento());
		System.out.println("Esta na Empresa: " + ger.isEstaNaEmpresa());
		System.out.println("Salario: " + ger.getSalario());		
		System.out.println("Ganho anual: " + ger.calculaGanhoAnual());
		System.out.println("Bonificação: " + ger.bonifica()); 
		
		System.out.println("==============================================================");
		
		System.out.println("Total de bonus:" + controle.getTotalDeBonus());
	}

}
