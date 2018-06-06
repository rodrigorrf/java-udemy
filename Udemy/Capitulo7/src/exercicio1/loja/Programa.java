package exercicio1.loja;

public class Programa {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setNome("Rodrigo");
		cliente.setCpf("123456789-00");
		cliente.setEndereco("Rua 1");
		
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("End: " + cliente.getEndereco());
		
		System.out.println("\n=================================================================\n");
		
		Fornecedor fornecedor = new Fornecedor();
		
		fornecedor.setNome("Carga");
		fornecedor.setCnpj("12345/0001");
		fornecedor.setEndereco("Rua 2");
		
		System.out.println("FORNECEDOR");
		System.out.println("Nome: " + fornecedor.getNome());
		System.out.println("CNPJ: " + fornecedor.getCnpj());
		System.out.println("End: " + fornecedor.getEndereco());
		
		Fornecedor f = new Fornecedor();
		f.nome = "RF";
		f.setCnpj("54321/0001");
		f.endereco = "Rua 2";
		System.out.println("Nome: " + f.nome);
		System.out.println("CNPJ: " + f.getCnpj());
		System.out.println("End: " + f.endereco);
	}

}
