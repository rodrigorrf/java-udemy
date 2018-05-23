package atributos.metodos.estaticos;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String rg;
	boolean estaNaEmpresa;
	
	
	//metodo 1
	public void calculaSalario(double valor) {
		this.salario = valor - (valor * 0.06);
	}
	
	//metodo 2
	public void calculaSalario(double valor, double horaExtra) {
		double valorHoraExtra = (valor / 30) / 8 * horaExtra;
		this.salario = valor - (valor * 0.06) + valorHoraExtra;
	}
	
	//metodo 3
	public void calculaSalario() {
		this.salario = 1000 - (1000 * 0.06);
	}
	
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
