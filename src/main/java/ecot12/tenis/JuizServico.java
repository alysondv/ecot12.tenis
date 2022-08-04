package ecot12.tenis;

public class JuizServico extends Juizes {

	public void atualiza(String acao) {
		if(acao.split(" ")[1].equals("pisouLinha")) {
			responsabilidade();
		}

	}

	@Override
	public String responsabilidade() {
		System.out.println("marca Falta");
		return "marca Falta";
	}

}
