package reforcando.polimorfismo;

public class Funcionario {
	protected String nome;
	protected String departamento;
	protected double salario;
	protected String dataEntrada;
	protected String rg;
	protected boolean estaNaEmpresa;	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
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

	public double bonifica() {
		return this.salario * 0.10 ;
	}
	
	public void demite() {
		estaNaEmpresa = false;
	}
	
	public double calculaGanhoAnual() {
		return this.salario * 12;
		
	}
	
	public void calculaSalario(double valor) {
		this.salario = valor - (valor * 0.06);
	}
	
	public void calculaSalario(double valor, double horaExtra) {
		double valorHoraExtra;
		valorHoraExtra = (valor/30) / 8 * horaExtra;
		this.salario = valor - (valor * 0.06) + valorHoraExtra;
	}
	
	public double calculaSalario() {
		return this.salario = this.salario - (this.salario * 0.06);
	}
	

}
