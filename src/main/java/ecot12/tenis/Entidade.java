package ecot12.tenis;

import java.util.ArrayList;
import java.util.List;

public abstract class Entidade {
	private List<Elemento> elemento = new ArrayList<Elemento>();
	void notifica(String acao) {
		for(Elemento e : elemento) {
			e.atualiza(acao);
		}
	}
	public List<Elemento> getElemento() {
		return elemento;
	}
	public void setElemento(List<Elemento> elemento) {
		this.elemento = elemento;
	}
}
