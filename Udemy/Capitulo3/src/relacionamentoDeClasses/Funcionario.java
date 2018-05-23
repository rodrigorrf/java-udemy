package relacionamentoDeClasses;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String rg;
	boolean estaNaEmpresa;
	
	public void bonifica(double valor) {
		salario += valor;
	}
	
	public void demite() {
		estaNaEmpresa = false;
	}
	
	public double calculaGanhoAnual() {
		salario *= 12;
		
		return salario;
	}

}
