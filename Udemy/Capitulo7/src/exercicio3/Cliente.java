package exercicio3;

public class Cliente {
	private String nome;
	private String cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void imprime() {
		System.out.println("=====Dados do Cliente=====");
		System.out.println("Nome: " + getNome());
		System.out.println("CPF: " + getCpf());
	}

}
