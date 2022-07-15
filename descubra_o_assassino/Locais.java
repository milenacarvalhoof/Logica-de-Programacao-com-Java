package descubra_o_assassino;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Locais {
	
	private List<String> locais = new ArrayList<>();
	
	public Locais() {
		locais.add("Redmond");
		locais.add("Palo Alto");
		locais.add("San Francisco");
		locais.add("Tokio");
		locais.add("Restaurante no Fim do Universo");
		locais.add("São Paulo");
		locais.add("Cupertino");
		locais.add("Helsinki");
		locais.add("Maida Vale");
		locais.add("Toronto");
	}

	public List<String> getLocais() {
		return locais;
	}

	public void setLocais(List<String> locais) {
		this.locais = locais;
	}
	
	public String gerarLocalDoCrime() {
		int min = 0;
		int max = 9;

		Random random = new Random();

		int value = random.nextInt(max + min) + min;
		return locais.get(value);
	}
	
	@Override
	public String toString() {
		String retorno = "Locais: \n";
		for (int i = 0; i < locais.size(); i++) {
			retorno += i+1 + ". " + locais.get(i) + "\n";
		}
		return retorno;
	}

}
