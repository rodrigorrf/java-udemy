package exercicio2.campeonato;

import javax.annotation.Generated;

public class Programa {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador();
		jogador1.setNome("Rodrigo");
		jogador1.setDataNascimento("29/03/82");
		jogador1.setPosicao("Atacante");
		
		Jogador jogador2 = new Jogador();
		jogador2.setNome("jogador2");
		jogador2.setDataNascimento("01/01/82");
		jogador2.setPosicao("Meia Direita");
		
		Jogador jogador3 = new Jogador();
		jogador3.nome = "jogador3";
		jogador3.dataNascimento = "10/10/82";
		jogador3.setPosicao("Meia Esquerda");
		
		Jogador jogador4 = new Jogador();
		jogador4.nome = "jogador4";
		jogador4.dataNascimento = "01/01/82";
		jogador4.setPosicao("Lateral Direito");
		
		Jogador jogador5 = new Jogador();
		jogador5.setNome("jogador5");
		jogador5.setDataNascimento("10/10/82");
		jogador5.setPosicao("Lateral Esquerdo");
		
		Jogador jogador6 = new Jogador();
		jogador6.setNome("jogador6");
		jogador6.setDataNascimento("01/01/82");
		jogador6.setPosicao("Centro Avante");
		
		Jogador jogador7 = new Jogador();
		jogador7.setNome("jogador7");
		jogador7.setDataNascimento("10/10/82");
		jogador7.setPosicao("Meio de Campo");
		
		Jogador jogador8 = new Jogador();
		jogador8.setNome("jogador8");
		jogador8.setDataNascimento("01/01/82");
		jogador8.setPosicao("Volante");
		
		Jogador jogador9 = new Jogador();
		jogador9.setNome("jogador9");
		jogador9.setDataNascimento("10/10/82");
		jogador9.setPosicao("Zagueiro Central");
		
		Jogador jogador10 = new Jogador();
		jogador10.setNome("jogador10");
		jogador10.setDataNascimento("01/01/82");
		jogador10.setPosicao("Quarto Zagueiro");
		
		Jogador jogador11 = new Jogador();
		jogador11.setNome("jogador11");
		jogador11.setDataNascimento("01/01/82");
		jogador11.setPosicao("Goleiro");
		
		Jogador[] jogadores1 = new Jogador[11];
		
		Tecnico tecnico1 = new Tecnico();
		tecnico1.nome = "tecnico1";
		tecnico1.dataNascimento = "10/10/70";
		tecnico1.setEspecialidade("Defesa");
		
		Equipe equipe1 = new Equipe();
		equipe1.setNome("S�o Paulo");
		equipe1.setCidade("S�o Paulo");
		equipe1.setTecnico(tecnico1);
		equipe1.setJogadores(jogadores1);
		equipe1.adicionaJogador(jogador1);
		equipe1.adicionaJogador(jogador2);
		equipe1.adicionaJogador(jogador3);
		equipe1.adicionaJogador(jogador4);
		equipe1.adicionaJogador(jogador5);
		equipe1.adicionaJogador(jogador6);
		equipe1.adicionaJogador(jogador7);
		equipe1.adicionaJogador(jogador8);
		equipe1.adicionaJogador(jogador9);
		equipe1.adicionaJogador(jogador10);
		equipe1.adicionaJogador(jogador11);
	
		Partida partida = new Partida();
		partida.setEquipe(equipe1);
		partida.setData("06/01/2016");
		partida.setEstadio("Morumbi");
		
		System.out.println("Partida: " + partida.getEquipe(equipe1).getNome());
		System.out.println("Estadio: " + partida.getEstadio());
		System.out.println("Data: " + partida.getData());
		
		System.out.println("==========Escala��o==========");
		/*for(Jogador j : equipe1.getJogadores()) {
			System.out.println(j.nome + " - " + j.getPosicao());
		}*/
		
		Equipe j = new Equipe();
		j.jogadores = new Jogador [equipe1.getJogadores().length];
		
		for(int i = 0 ; i < equipe1.getJogadores().length; i ++) {
			j.setJogadores(equipe1.getJogadores());
			System.out.println(j.getNome());
		}
		
	}

}
