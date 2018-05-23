package construtores;

public class Programa {

	public static void main(String[] args) {
		//construtor server para colocar uma obrigatoriedade na constru��o da classe  ou fazer inicializa��o com parametros
		Cliente cliente = new Cliente("12345678-90");
		cliente.setNome("Rodrigo");
		//cliente.setCpf("12345678-90");
		
		Conta conta = new Conta(cliente);
		//conta.setTitular (cliente);
		conta.setNumeroConta(123);
		conta.depositar(2000);
		
		
		
		System.out.println("Endere�o na mem�ria da conta:         " + conta);
		System.out.println("Endere�o na mem�ria da conta.titular: " + conta.getTitular());
		System.out.println("Endere�o na mem�ria da cliente:       " + cliente);
		
		//System.out.println("Nome: " + conta.getTitular());
		System.out.println("Nome: " + conta.getTitular().getNome());
		System.out.println("CPF: " + conta.getTitular().getCpf());		
		System.out.println("N� Conte: " + conta.getNumeroConta());
		System.out.println("Saldo: " + conta.getSaldo());
			
	}
}
