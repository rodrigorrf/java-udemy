package locadora;

public class Programa {

	public static void main(String[] args) {
		Filme filme = new Filme();
		
		
		filme.codigo = 123;
		filme.nome = "A Era do Gelo";
		filme.valor = 2.50;		
		
		//Filme filme2 = new Filme();
		Filme filme2 = filme;
		filme2.codigo = 1234;
		filme2.nome = "A Era do Gelo 4";
		filme2.valor = 3.50;
		
		System.out.println(filme);
		System.out.println(filme.codigo);
		System.out.println(filme.nome);
		System.out.println(filme.valor);
		
		filme.retiraFilme();
		
		if(filme.disponivel == true) {
			System.out.println("Filme disponivel");
		}else {
			System.out.println("Filme não disponivel");
		}
		
		filme.devolveFilme();
		if(filme.disponivel == true) {
			System.out.println("Filme disponivel");
		}else {
			System.out.println("Filme não disponivel");
		}
		
		System.out.println(filme2);
		System.out.println(filme2.codigo);
		System.out.println(filme2.nome);
		System.out.println(filme2.valor);
		

	}

}

