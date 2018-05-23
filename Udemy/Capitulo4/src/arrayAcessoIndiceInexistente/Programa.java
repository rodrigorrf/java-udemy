package arrayAcessoIndiceInexistente;

public class Programa {

	public static void main(String[] args) {
		Filme filme = new Filme();
		
		
		filme.codigo = 123;
		filme.nome = "A Era do Gelo";
		filme.valor = 2.50;		
		
		Filme filme2 = new Filme();
		filme2.codigo = 1234;
		filme2.nome = "A Era do Gelo 2";
		filme2.valor = 3.50;
		
		Filme filme3 = new Filme();
		filme3.codigo = 12345;
		filme3.nome = "A Era do Gelo 3";
		filme3.valor = 4.50;
		
		Filme filme4 = new Filme();
		filme4.codigo = 12348;
		filme4.nome = "A Era do Gelo 4";
		filme4.valor = 5.50;
		
		Filme filme5 = new Filme();
		filme5.codigo = 1234;
		filme5.nome = "A Era do Gelo 5";
		filme5.valor = 6.50;
		
		Filme filmes[] = new Filme[7];
		filmes[0] = filme;
		filmes[1] = filme2;
		filmes[2] = filme3;
		filmes[3] = filme4;
		filmes[4] = filme5;	
		
		System.out.println("===COM FOR ERRADO===");
		for(int i = 0; i< 7; i++) {
			System.out.println("INDICE do filme:" + filmes[i]);
			System.out.println("CODIGO do filme:" + filmes[i].codigo);
			System.out.println("NOME do filme:" + filmes[i].nome);
			System.out.println("VALOR do filme:" + filmes[i].valor);
		}
		System.out.println("===FIM FOR===");
		
		System.out.println("===COM FOR length===");
		for(int i = 0; i< filmes.length; i++) {
			System.out.println("INDICE do filme:" + filmes[i]);
			System.out.println("CODIGO do filme:" + filmes[i].codigo);
			System.out.println("NOME do filme:" + filmes[i].nome);
			System.out.println("VALOR do filme:" + filmes[i].valor);
		}
		System.out.println("===FIM FOR length===");
		System.out.println(filme);
		System.out.println(filme2);
		System.out.println(filme3);
		System.out.println(filme4);
		System.out.println(filme5);
		System.out.println("===COM ENHANCED-FOR===");
		for(Filme film : filmes) {
			System.out.println("INDICE do filme:" + film);
			System.out.println("CODIGO do filme:" + film.codigo);
			System.out.println("NOME do filme:" + film.nome);
			System.out.println("VALOR do filme:" + film.valor);			
		}
		System.out.println("===FIM ENHANCED-FOR===");
	}
}

