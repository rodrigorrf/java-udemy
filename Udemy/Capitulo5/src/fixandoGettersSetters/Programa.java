package fixandoGettersSetters;

public class Programa {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Rodrigo");
		cliente.setCpf("12345678-90");
		
		Conta conta = new Conta();
		conta.setTitular (cliente);
		conta.setNumeroConta(123);
		conta.depositar(2000);
		
		
		
		System.out.println("Endereço na memória da conta:         " + conta);
		System.out.println("Endereço na memória da conta.titular: " + conta.getTitular());
		System.out.println("Endereço na memória da cliente:       " + cliente);
		
		System.out.println("Nome: " + conta.getTitular());
		System.out.println("Nome: " + conta.getTitular().getNome());
		System.out.println("CPF: " + conta.getTitular().getCpf());		
		System.out.println("Nº Conte: " + conta.getNumeroConta());
		System.out.println("Saldo: " + conta.getSaldo());
			
	}
}
