package exercicio2.campeonato;

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
		equipe1.setNome("São Paulo");
		equipe1.setCidade("São Paulo");
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
		
		//==================================
		Jogador jogador0 = new Jogador();
		jogador0.setNome("jogador0");
		jogador0.setDataNascimento("29/03/82");
		jogador0.setPosicao("Atacante");
		
		Jogador jogador12 = new Jogador();
		jogador12.setNome("jogador12");
		jogador12.setDataNascimento("01/01/82");
		jogador12.setPosicao("Meia Direita");
		
		Jogador jogador13 = new Jogador();
		jogador13.nome = "jogador13";
		jogador13.dataNascimento = "10/10/82";
		jogador13.setPosicao("Meia Esquerda");
		
		Jogador jogador14 = new Jogador();
		jogador14.nome = "jogador14";
		jogador14.dataNascimento = "01/01/82";
		jogador14.setPosicao("Lateral Direito");
		
		Jogador jogador15 = new Jogador();
		jogador15.setNome("jogador15");
		jogador15.setDataNascimento("10/10/82");
		jogador15.setPosicao("Lateral Esquerdo");
		
		Jogador jogador16 = new Jogador();
		jogador16.setNome("jogador16");
		jogador16.setDataNascimento("01/01/82");
		jogador16.setPosicao("Centro Avante");
		
		Jogador jogador17 = new Jogador();
		jogador17.setNome("jogador17");
		jogador17.setDataNascimento("10/10/82");
		jogador17.setPosicao("Meio de Campo");
		
		Jogador jogador18 = new Jogador();
		jogador18.setNome("jogador18");
		jogador18.setDataNascimento("01/01/82");
		jogador18.setPosicao("Volante");
		
		Jogador jogador19 = new Jogador();
		jogador19.setNome("jogador19");
		jogador19.setDataNascimento("10/10/82");
		jogador19.setPosicao("Zagueiro Central");
		
		Jogador jogador20 = new Jogador();
		jogador20.setNome("jogador20");
		jogador20.setDataNascimento("01/01/82");
		jogador20.setPosicao("Quarto Zagueiro");
		
		Jogador jogador21 = new Jogador();
		jogador21.setNome("jogador21");
		jogador21.setDataNascimento("01/01/82");
		jogador21.setPosicao("Goleiro");
		
		Jogador[] jogadores2 = new Jogador[11];
		
		Tecnico tecnico2 = new Tecnico();
		tecnico2.setNome("tecnico2");
		tecnico2.dataNascimento = "10/10/70";
		tecnico2.setEspecialidade("Ataque");
		
		Equipe equipe2 = new Equipe();
		equipe2.setNome("Piracicaba");
		equipe2.setCidade("Piracicaba");
		equipe2.setTecnico(tecnico2);
		equipe2.setJogadores(jogadores2);
		equipe2.adicionaJogador(jogador0);
		equipe2.adicionaJogador(jogador12);
		equipe2.adicionaJogador(jogador13);
		equipe2.adicionaJogador(jogador14);
		equipe2.adicionaJogador(jogador15);
		equipe2.adicionaJogador(jogador16);
		equipe2.adicionaJogador(jogador17);
		equipe2.adicionaJogador(jogador18);
		equipe2.adicionaJogador(jogador19);
		equipe2.adicionaJogador(jogador20);
		equipe2.adicionaJogador(jogador21);
		//==================================
	
		Partida partida = new Partida();
		partida.setEquipe(equipe1);
		partida.setEquipe(equipe2);
		partida.setData("06/01/2016");
		partida.setEstadio("Morumbi");
		
		System.out.println("=====Copa Paulista=====");		
		System.out.println("Partida: " + partida.getEquipe(equipe1).getNome() + " x " + partida.getEquipe(equipe2).getNome());
		System.out.println("Estadio: " + partida.getEstadio());
		System.out.println("Data: " + partida.getData());
		
		System.out.println("=====Informação do Time da Casa=====");
		System.out.println("Nome do Clube: " + equipe1.getNome());
		System.out.println("Técnico: " + equipe1.getTecnico().nome);
		System.out.println("Especialidade: " + equipe1.getTecnico().getEspecialidade());
		System.out.println("Destaque do time: " + jogador1.getNome());
		System.out.println("Posição: " + jogador1.getPosicao());
		System.out.println("Data de nascimento: " + jogador1.getDataNascimento());

		System.out.println("=====Escalação=====");
		//Modo 1
		/*for(Jogador j : equipe1.getJogadores()) {
			System.out.println(j.nome + " - " + j.getPosicao());
		}*/
		
		//Modo 2 feito por mim
		Jogador[] j = new Jogador[11];
		
		j = equipe1.getJogadores();
		
		for(int i = 0 ; i < equipe1.getJogadores().length; i ++) {
			System.out.println(j[i].nome + " - " + j[i].getPosicao());
		}
		
		//============================================================
		System.out.println("=====Informação do Time Visitante=====");
		System.out.println("Nome do Clube: " + equipe2.getNome());
		System.out.println("Técnico: " + equipe2.getTecnico().nome);
		System.out.println("Especialidade: " +equipe2.getTecnico().getEspecialidade());
		System.out.println("Destaque do time: " + jogador2.getNome());
		System.out.println("Posição: " + jogador2.getPosicao());
		System.out.println("Data de nascimento: " + jogador2.getDataNascimento());

		System.out.println("=====Escalação=====");
		
		//Modo 1
		/*for(Jogador j : equipe1.getJogadores()) {
			System.out.println(j.nome + " - " + j.getPosicao());
		 }*/
		
		//Modo 2 feito por mim
		//Jogador[] j = new Jogador[11];
					
		j = equipe2.getJogadores();
				
		for(int i = 0 ; i < equipe2.getJogadores().length; i ++) {
			System.out.println(j[i].nome + " - " + j[i].getPosicao());
		}
		
	}

}
