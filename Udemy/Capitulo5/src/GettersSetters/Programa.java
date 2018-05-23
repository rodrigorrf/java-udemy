package GettersSetters;

public class Programa {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nome = "Rodrigo";
		cliente.cpf = "12345678-90";
		
		Conta conta = new Conta();
		conta.setTitular (cliente);
		conta.setNumeroConta(123);
		conta.depositar(2000);
		
		
		
		System.out.println("Endereço na memória da conta:         " + conta);
		System.out.println("Endereço na memória da conta.titular: " + conta.getTitular());
		System.out.println("Endereço na memória da cliente:       " + cliente);
		
		System.out.println("Nome: " + conta.getTitular());
		System.out.println("Nome: " + conta.getTitular().nome);
		System.out.println("CPF: " + conta.getTitular().cpf);		
		System.out.println("Nº Conte: " + conta.getNumeroConta());
		System.out.println("Saldo: " + conta.getSaldo());
		
		if(conta.sacar(1000) == true) {
			System.out.println("SAQUE RELIZADO");
			System.out.println("Seu saldo agora é de: " + conta.getSaldo());
		}else {
			System.out.println("SAQUE ACIMA DO VALOR DO SALDO");
			System.out.println("Seu saldo é de: " + conta.getSaldo());
		}
		
		
		cliente.nome = "Roberto";
		cliente.cpf = "87654321-09";
		
		Conta conta2 = new Conta();
		conta2.setTitular (cliente);
		conta2.setNumeroConta(321);
		conta2.depositar(1000);
		
		System.out.println("Endereço na memória da conta2:         " + conta2);
		System.out.println("Endereço na memória da conta2.titular: " + conta2.getTitular());
		System.out.println("Endereço na memória da cliente:       " + cliente);
		
		System.out.println("Nome: " + conta2.getTitular());
		System.out.println("Nome: " + conta2.getTitular().nome);
		System.out.println("CPF: " + conta2.getTitular().cpf);		
		System.out.println("Nº Conte: " + conta2.getNumeroConta());
		System.out.println("Saldo: " + conta2.getSaldo());
		
		if(conta.transferir(conta2, 100) == true){
			System.out.println("Transferido para conta2: " );
		}else {
			System.out.println("Transferencia nao realizada");
		}

		System.out.println("Saldo conta: " + conta.getSaldo());
		System.out.println("Saldo conta2: " + conta2.getSaldo());
	}
}
