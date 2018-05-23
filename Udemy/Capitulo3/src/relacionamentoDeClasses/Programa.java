package relacionamentoDeClasses;

public class Programa {

	public static void main(String[] args) {
		
//==============================================================//	
		Cliente cliente = new Cliente();
		cliente.nome = "Rodrigo";
		cliente.cpf = "12345678-90";
		
		Conta conta = new Conta();
		conta.titular = cliente;
		conta.numeroConta = 123;		
		conta.saldo = 2000.0;
		
		/*if(conta.sacar(500.0) == true) {
			System.out.println("Operação SAQUE realizada con sucesso");
		}else {
			System.out.println("Operação SAQUE não realizada con sucesso");
		}*/
		
		System.out.println("Endereço na memória da conta:         " + conta);
		System.out.println("Endereço na memória da conta.titular: " + conta.titular);
		System.out.println("Endereço na memória da cliente:       " + cliente);
		System.out.println("Nome: " + conta.titular.nome);
		System.out.println("CPF: " + conta.titular.cpf);
		
		System.out.println("Nº Conte: " + conta.numeroConta);
		System.out.println("Saldo: " + conta.saldo);
		
//==============================================================//		
		/*Conta conta2 = new Conta();
		conta2.numeroConta = 2;
		conta2.titular.nome = "Roberto";
		conta2.saldo = 800.0;
		
	
		System.out.println(conta2.numeroConta);
		System.out.println(conta2.titular);
		System.out.println("Saldo sem tranf: " + conta2.saldo);
						
		if(conta.transferir(conta2, 500.0) == true) {
			System.out.println("Transferência realizada");
			System.out.println("Saldo com tranf: " + conta2.saldo);
		}else {
			System.out.println("Transferência não realizada");
		}
		
//==============================================================//
		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = "Ramos";
		funcionario.rg = "1234567";
		funcionario.salario = 4500.0;
		funcionario.estaNaEmpresa = true;
		funcionario.demite();
		
		System.out.println("Nome: " + funcionario.nome);
		System.out.println("RG: " + funcionario.rg);
		System.out.println("Salario: " + funcionario.salario);
		System.out.println("Esta na empresa: " + funcionario.estaNaEmpresa);
		funcionario.bonifica(500.0);
		System.out.println("Bonificação: " + funcionario.salario);
		System.out.println("Ganho anual: "+funcionario.calculaGanhoAnual());*/
		
		
				
	}
}
