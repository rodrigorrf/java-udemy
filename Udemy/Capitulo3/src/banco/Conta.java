package banco;

public class Conta {
	int numeroConta;
	String titular;
	double saldo;
	
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void transferir(Conta contaDestino, double valor) {
		saldo -= valor;
		contaDestino.saldo += valor;
	}
}
