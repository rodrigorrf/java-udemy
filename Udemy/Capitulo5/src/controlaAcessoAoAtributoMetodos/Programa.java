package controlaAcessoAoAtributoMetodos;

public class Programa {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nome = "Rodrigo";
		cliente.cpf = "12345678-90";
		
		Conta conta = new Conta();
		conta.titular = cliente;
		conta.numeroConta = 123;
		conta.enviaSaldo(2000.0);
		
		
		System.out.println("Endere�o na mem�ria da conta:         " + conta);
		System.out.println("Endere�o na mem�ria da conta.titular: " + conta.titular);
		System.out.println("Endere�o na mem�ria da cliente:       " + cliente);
		System.out.println("Nome: " + conta.titular.nome);
		System.out.println("CPF: " + conta.titular.cpf);		
		System.out.println("N� Conte: " + conta.numeroConta);
		System.out.println("Saldo: " + conta.pegaSaldo());				
	}
}
