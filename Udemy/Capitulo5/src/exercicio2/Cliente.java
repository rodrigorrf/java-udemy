package exercicio2;

public class Cliente{
	private String nome;
	private String cpf;
	
	//construtor
	public Cliente(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome( String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf( String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
}
