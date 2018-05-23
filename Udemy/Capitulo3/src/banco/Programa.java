package banco;

public class Programa {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.numeroConta = 1;
		conta.titular = "Rodrigo";
		conta.saldo = 500.0;
		//conta.sacar(200.0);
		
		
		Conta conta2 = new Conta();
		conta2.numeroConta = 2;
		conta2.titular = "Roberto";
		conta2.saldo = 700.0;
		
		conta.transferir(conta2, 300.0);	
			
		System.out.println(conta.numeroConta);
		System.out.println(conta.titular);
		System.out.println(conta.saldo);
		
		//conta.depositar(800.0);
		//System.out.println(conta.saldo);
		
		System.out.println(conta2.numeroConta);
		System.out.println(conta2.titular);
		System.out.println(conta2.saldo);
		
	}
}
