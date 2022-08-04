package ecot12.tenis;

public class JuizFundoQuadra extends Juizes {

	public void atualiza(String acao) {
		if(acao.split(" ")[1].equals("maConduta")) {
			responsabilidade();
		}

	}

	@Override
	public String responsabilidade() {
		System.out.println("Desclassifica jogador");
		return "desclassifica Jogador";
	}

}
