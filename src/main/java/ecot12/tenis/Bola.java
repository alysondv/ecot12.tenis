package ecot12.tenis;

public class Bola implements Equipamentos {
	private float diametro;
	private String composicao;
	public float getDiametro() {
		return diametro;
	}
	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}
	public String getComposicao() {
		return composicao;
	}
	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}
	public void acao() {
		System.out.println("é jogada");
	}

}
