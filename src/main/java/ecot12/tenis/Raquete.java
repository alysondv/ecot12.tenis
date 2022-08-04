package ecot12.tenis;

public class Raquete implements Equipamentos {
	private float tamanho;
	private String composicao;
	
	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getComposicao() {
		return composicao;
	}

	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}

	public void acao() {
		System.out.println("rebate");
	}

}
