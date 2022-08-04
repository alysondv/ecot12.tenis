package ecot12.tenis;

public class Quadra implements Equipamentos {
	private float comprimento;
	private float largura;
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public void acao() {
		System.out.println("é utilizada");
	}

}
