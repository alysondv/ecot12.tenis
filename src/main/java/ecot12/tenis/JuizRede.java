package ecot12.tenis;

public class JuizRede extends Juizes {

	public void atualiza(String acao) {
		if(acao.split(" ")[1].equals("toqueRede")) {
			responsabilidade();
		}

	}

	@Override
	public String responsabilidade() {
		System.out.println("volta saque");
		return "volta saque";
	}

}
