package ecot12.tenis;

public class JuizCentralLinha extends Juizes {

	public void atualiza(String acao) {
		if(acao.split(" ")[1].equals("bolaCaiErrado")) {
			responsabilidade();
		}

	}

	@Override
	public String responsabilidade() {
		System.out.println("marca Falta");
		return "Marca Falta";
	}
}
