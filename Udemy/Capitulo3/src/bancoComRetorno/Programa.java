package bancoComRetorno;

public class Programa {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.numeroConta = 1;
		conta.titular = "Rodrigo";
		conta.saldo = 1000.0;
		
		if(conta.sacar(500.0) == true) {
			System.out.println("Operação SAQUE realizada con sucesso");
		}else {
			System.out.println("Operação SAQUE não realizada con sucesso");
		}
				
		
		System.out.println(conta.numeroConta);
		System.out.println(conta.titular);
		System.out.println(conta.saldo);
		
		
		Conta conta2 = new Conta();
		conta2.numeroConta = 2;
		conta2.titular = "Roberto";
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
		System.out.println("Ganho anual: "+funcionario.calculaGanhoAnual());
		
		
				
	}
}
