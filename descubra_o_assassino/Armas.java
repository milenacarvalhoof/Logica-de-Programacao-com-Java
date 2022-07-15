package descubra_o_assassino;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armas {
	
	private List<String> armas = new ArrayList<>();
	
	public Armas() {
		armas.add("Peixeira");
		armas.add("DynaTAC 8000X");
		armas.add("Trezoitão");
		armas.add("Trebuchet");
		armas.add("Maça");
		armas.add("Gládio");
	}

	public List<String> getArmas() {
		return armas;
	}

	public void setArmas(List<String> armas) {
		this.armas = armas;
	}
	
	public String gerarArmaDoCrime() {
		int min = 0;
		int max = 5;

		Random random = new Random();

		int value = random.nextInt(max + min) + min;
		return armas.get(value);
	}

	@Override
	public String toString() {
		String retorno = "Armas: \n";
		for (int i = 0; i < armas.size(); i++) {
			retorno += i+1 + ". " + armas.get(i) + "\n";
		}
		return retorno;
	}

}
