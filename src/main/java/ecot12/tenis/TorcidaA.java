package ecot12.tenis;

import java.util.ArrayList;
import java.util.List;

public class TorcidaA extends Torcida {
	private List<Pessoa> torcedores = new ArrayList<Pessoa>();
	public List<Pessoa> getTorcedores() {
		return torcedores;
	}
	public void setTorcedores(List<Pessoa> torcedores) {
		this.torcedores = torcedores;
	}
	@Override
	public void aplaude() {
		// TODO Auto-generated method stub
		System.out.println("Aplaude player1");
	}
	@Override
	public void atualiza(String acao) {
		if(acao.split(" ")[0].equals("player1")) {
			aplaude();
		}
	}

}
