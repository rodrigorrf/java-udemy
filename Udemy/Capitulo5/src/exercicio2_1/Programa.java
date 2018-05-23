package exercicio2_1;



public class Programa {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("123456789-11");
		cliente.setNome("Rodrigo");
			
		Conta conta = new Conta(cliente);
		//conta.setNumeroConta(12345);
		conta.depositar(3000);
		
		System.out.println("CONTA 1");
		System.out.println("Nome1: " + conta.getTitular().getNome());
		System.out.println("CPF1: " + conta.getTitular().getCpf());
		System.out.println("Conta1: " + conta.getNumeroConta());
		System.out.println("Saldo1: " + conta.getSaldo());
		
		
		Cliente cliente2 = new Cliente("987654321-00");
		cliente2.setNome("Roberto");
		//construtor 2
		Conta conta2 = new Conta(cliente2);
		//conta2.setNumeroConta(1234);
		conta2.depositar(2000);
		
		System.out.println("\nCONTA 2");
		System.out.println("Nome2: " + conta2.getTitular().getNome());
		System.out.println("CPF2: " + conta2.getTitular().getCpf());
		System.out.println("Conta2: " + conta2.getNumeroConta());
		System.out.println("Saldo2: " + conta2.getSaldo());
		
		
		//construtor 2
		Cliente cliente3 = new Cliente("987654321-00");
		cliente3.setNome("Ramos");
		Conta conta3 = new Conta(cliente3);
		conta3.depositar(1000);
		conta3.setTitular(cliente3);		
		System.out.println("\nCONTA 3");
		
		conta3.imprime();
		/*System.out.println("Nome3: " + conta3.getTitular().getNome());
		System.out.println("CPF3: " + conta3.getTitular().getCpf());
		System.out.println("Conta3: " + conta3.getNumeroConta());
		System.out.println("Saldo3: " + conta3.getSaldo());*/
		
		System.out.println("\nTotal de contas criadas com contador:" + Conta.getContador());
		System.out.println("\nTotal de contas criadas com conta:" + Conta.getCont());
	}	
		
}
