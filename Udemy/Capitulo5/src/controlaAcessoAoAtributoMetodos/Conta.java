package controlaAcessoAoAtributoMetodos;

public class Conta{
	int numeroConta;
	Cliente titular;
	private double saldo;
	
	public void enviaSaldo(double valor) {
		if(valor > 0) {
			saldo = valor;
		}
	}
	public double pegaSaldo() {
		return saldo;
	}
	
	public boolean sacar(double valor) {
		if(saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}else {
			return false;
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public boolean transferir(Conta contaDestino, double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			contaDestino.saldo += valor;
			return true;
		}else {
			return false;
		}
	}	
}
