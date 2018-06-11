package exercicio3;

public class Conta{
	protected int numeroConta;
	protected Cliente titular;
	protected double saldo;
	
	/*public void enviaSaldo(double valor) {
		if(valor > 0) {
			saldo = valor;
		}
	}*/
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNumeroConta( int conta) {
		this.numeroConta = conta;
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}else {
			return false;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean transferir(Conta contaDestino, double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
	
	public void imprime() {
		System.out.println("=====Dados da Conta do Cliente=====");
		System.out.println("Nome: " + titular.getNome());
		System.out.println("CPF: " + titular.getCpf());
		System.out.println("Nº da cont: " + getNumeroConta());
		System.out.println("Saldo atual: " + getSaldo());
	}

}
