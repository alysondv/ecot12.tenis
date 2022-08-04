package ecot12.tenis;

public abstract class Torcida implements Elemento {
	private Jogador player1;
	private Jogador player2;
	public Jogador getPlayer1() {
		return player1;
	}
	public void setPlayer1(Jogador player1) {
		this.player1 = player1;
	}
	public Jogador getPlayer2() {
		return player2;
	}
	public void setPlayer2(Jogador player2) {
		this.player2 = player2;
	}
	public void atualiza(String acao) {
		// TODO Implementar a ação de torcer
		System.out.println("torcer");
	}
	public abstract void aplaude();

}
