package ecot12.tenis;

public class Placar implements Elemento {
	private static Placar instancia = new Placar();
	private int pontosPlayer1;
	private int pontosPlayer2;
	private int gamePlayer1;
	private int gamePlayer2;
	private int setPlayer1;
	private int setPlayer2;
	private Placar() {}
	
	public void atualiza(String acao) {
		String[] player = acao.split(" ");
		if(player[0].equals("player1")) {
			if(player[1].equals("marcaPonto")) {				
				if(this.getPontosPlayer1() < 3) {					
					this.setPontosPlayer1(this.getPontosPlayer1() + 1);
				}else {
					this.setPontosPlayer1(0);
					if(this.getGamePlayer1() < 5) {
						this.setGamePlayer1(this.getGamePlayer1() + 1);
					}else {
						this.setGamePlayer1(0);
						this.setSetPlayer1(this.getSetPlayer1() + 1);
					}
				}
			}else if(player[1].equals("marcaSet")) {
				this.setSetPlayer1(this.getSetPlayer1() + 1);
			}else if(player[1].equals("marcaGame")) {
				if(this.getGamePlayer1() < 3) {					
					this.setGamePlayer1(this.getGamePlayer1() + 1);
				}else {
					this.setGamePlayer1(0);
					this.setSetPlayer1(this.getSetPlayer1() + 1);
				}
			}
		}else {
			if(player[1].equals("marcaPonto")) {				
				if(this.getPontosPlayer2() < 3) {					
					this.setPontosPlayer2(this.getPontosPlayer2() + 1);
				}else {
					this.setPontosPlayer2(0);
					if(this.getGamePlayer2() < 5) {
						this.setGamePlayer2(this.getGamePlayer2() + 1);
					}else {
						this.setGamePlayer2(0);
						this.setSetPlayer2(this.getSetPlayer2() + 1);
					}
				}
			}else if(player[1].equals("marcaSet")) {
				this.setSetPlayer2(this.getSetPlayer2() + 1);
			}else if(player[1].equals("marcaGame")) {
				if(this.getGamePlayer2() < 3) {					
					this.setGamePlayer2(this.getGamePlayer2() + 1);
				}else {
					this.setGamePlayer2(0);
					this.setSetPlayer2(this.getSetPlayer2() + 1);
				}
			}
		}
		fimDeJogo();
	}
	
	public int getPontosPlayer1() {
		return pontosPlayer1;
	}
	public void setPontosPlayer1(int pontosPlayer1) {
		this.pontosPlayer1 = pontosPlayer1;
	}
	public int getPontosPlayer2() {
		return pontosPlayer2;
	}
	public void setPontosPlayer2(int pontosPlayer2) {
		this.pontosPlayer2 = pontosPlayer2;
	}
	public int getGamePlayer1() {
		return gamePlayer1;
	}
	public void setGamePlayer1(int gamePlayer1) {
		this.gamePlayer1 = gamePlayer1;
	}
	public int getGamePlayer2() {
		return gamePlayer2;
	}
	public void setGamePlayer2(int gamePlayer2) {
		this.gamePlayer2 = gamePlayer2;
	}
	public int getSetPlayer1() {
		return setPlayer1;
	}
	public void setSetPlayer1(int setPlayer1) {
		this.setPlayer1 = setPlayer1;
	}
	public int getSetPlayer2() {
		return setPlayer2;
	}
	public void setSetPlayer2(int setPlayer2) {
		this.setPlayer2 = setPlayer2;
	}
	public static void setInstancia(Placar instancia) {
		Placar.instancia = instancia;
	}
	public static Placar getInstancia() {
		return instancia;
	}
	
	public void ImprimePlacar() {
		System.out.println("player 1: " + "\nGame: " + this.getGamePlayer1() + " Sets: " + this.getSetPlayer1() + " Pontos: " + this.getPontosPlayer1());
		System.out.println("player 2: " + "\nGame: " + this.getGamePlayer2() + " Sets: " + this.getSetPlayer2() + " Pontos: " + this.getPontosPlayer2());
	}

	public void fimDeJogo() {
		if(this.getSetPlayer1() == 5) {
			System.out.println("Player1 é o vencedor");
		}else if(this.getSetPlayer2() == 5) {
			System.out.println("player2 é o vencedor");
		}
	}
}
