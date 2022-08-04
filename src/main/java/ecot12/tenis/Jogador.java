package ecot12.tenis;

public class Jogador extends Entidade {
	private Bola bola;
	private Raquete raquete;
	private String maoDOminante;
	public void setJogada(String j) {
		this.notifica(j);
	}
	public Jogador(Bola b, Raquete r) {
		this.bola = b;
		this.raquete = r;
	}
	public Bola getBola() {
		return bola;
	}
	public void setBola(Bola bola) {
		this.bola = bola;
	}
	public Raquete getRaquete() {
		return raquete;
	}
	public void setRaquete(Raquete raquete) {
		this.raquete = raquete;
	}
	public String getMaoDOminante() {
		return maoDOminante;
	}
	public void setMaoDOminante(String maoDOminante) {
		this.maoDOminante = maoDOminante;
	}
}
