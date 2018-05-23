package bancoComRetorno;

public class Conta {
	int numeroConta;
	String titular;
	double saldo;
	
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
