package ecot12.tenis;

public class App {

	public static void main(String[] args) {
		// instancia um objeto unico placar
		Placar placar = Placar.getInstancia();
		placar.ImprimePlacar();
		
		// instancia o objeto unico novamente 
		Placar placar2 = Placar.getInstancia();
		
		// instancia o equipamento bola
		Bola b1 = new Bola();
		b1.setDiametro(6.35f);
		b1.setComposicao("borracha e lã");
		
		//instancia o equipamento raquete
		Raquete r1 = new Raquete();
		r1.setTamanho(10f);
		r1.setComposicao("fibra de carbono");
		
		// instancia os dois jogadores
		Jogador player1 = new Jogador(b1, r1);
		Jogador player2 = new Jogador(b1, r1);
		
		// printa o placar atual do jogo
		System.out.println("\nPlacar1:" + placar );	
		System.out.println("Placar2: " + placar2 + "\n");
				
		
		// instancia a torcida do player1
		TorcidaA t1 = new TorcidaA();
		t1.setPlayer1(player1);
		t1.setPlayer2(player2);
		
		// instancia a torcida do player2 
		TorcidaB t2 = new TorcidaB();
		t2.setPlayer2(player2);
		t2.setPlayer1(player1);
		
		// instancia o equipamento quadra
		Quadra q1 = new Quadra();
		q1.setComprimento(23.77f);
		q1.setLargura(8.23f);
		
		// set os equipamentos e mao dominante para o player 1
		player1.setRaquete(new Raquete());
		player1.setBola(b1);
		player1.setMaoDOminante("direita");
		
		// set os equipamentos e mao dominante para o player 2
		player2.setRaquete(new Raquete());
		player2.setBola(b1);
		player2.setMaoDOminante("direita");
		
		// instancia um juiz de cadeira com nome e idade e printa
		JuizCadeira j1 = new JuizCadeira();
		j1.setNome("daronco");
		j1.setIdade(40);
		System.out.println();
		System.out.println(j1.getNome());
		System.out.println(j1.getIdade());
		System.out.println();
	
		// instancia 1 novo objeto de cada classe de juiz
		JuizSaque j2 = new JuizSaque();
		JuizServico j3 = new JuizServico();
		JuizRede j4 = new JuizRede();
		JuizLinha j5 = new JuizLinha();
		JuizCentralLinha j6 = new JuizCentralLinha();
		JuizFundoQuadra j7 = new JuizFundoQuadra();
		
		// adiciona os participantes(observadores) para o player 1 e 2
		player1.getElemento().add(placar);
		player1.getElemento().add(t1);
		player1.getElemento().add(j1);
		player1.getElemento().add(j2);
		player1.getElemento().add(j3);
		player1.getElemento().add(j4);
		player1.getElemento().add(j5);
		player1.getElemento().add(j6);
		player1.getElemento().add(j7);
		
		player2.getElemento().add(placar2);
		player2.getElemento().add(t2);
		player2.getElemento().add(j1);
		player2.getElemento().add(j2);
		player2.getElemento().add(j3);
		player2.getElemento().add(j4);
		player2.getElemento().add(j5);
		player2.getElemento().add(j6);
		player2.getElemento().add(j7);
		
		// player 1 e player 2 realizam ações
		player1.setJogada("player1 marcaSet");
		player1.setJogada("player1 marcaSet");
		player1.setJogada("player1 marcaSet");
		player1.setJogada("player1 marcaSet");
		player2.setJogada("player2 marcaSet");
		
		
		// comete um toque de rede para que o juiz possa flagrar
		player2.setJogada("player1 toqueRede");
		
		// player 1 marca o set final para ganhar o jogo 
		player1.setJogada("player1 marcaSet");
		
		// imprime o placar final do jogo
		placar.ImprimePlacar();
	}
}
