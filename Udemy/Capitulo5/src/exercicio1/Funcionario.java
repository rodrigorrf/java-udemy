package exercicio1;

public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String rg;
	private boolean estaNaEmpresa;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return this.departamento;
	}
		
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}

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
