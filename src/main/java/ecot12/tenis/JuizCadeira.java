package ecot12.tenis;

public class JuizCadeira extends Juizes {

	public void atualiza(String acao) {
		if(acao.split(" ")[1].equals("duvidaBola")) {
			responsabilidade();
		}

	}

	@Override
	public String responsabilidade() {
		System.out.println("Aplica sanção");
		return "Aplica sanção";
	}

}
