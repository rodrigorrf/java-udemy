package arrayAcessoIndiceInexistente;

public class Filme {
	int codigo;
	String nome;
	double valor;
	boolean disponivel;
	
	public void retiraFilme() {
		disponivel = false;
		//return disponivel;
	}
	
	public void devolveFilme() {
		disponivel = true;
		//return disponivel;
	}
	
	public boolean devolveFilme(boolean devolve) {
		disponivel = devolve;
		return disponivel;
	}
	
}
