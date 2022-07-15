package descubra_o_assassino;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Suspeitos {
	
	private List<String> suspeitos = new ArrayList<>();
	
	public Suspeitos() {
		suspeitos.add("Charles B. Abbage");
		suspeitos.add("Donald Duck Knuth");
		suspeitos.add("Ada L. Ovelace");
		suspeitos.add("Alan T. Uring");
		suspeitos.add("Ivar J. Acobson");
		suspeitos.add("Ras Mus Ler Dorf");
	}

	public List<String> getSuspeitos() {
		return suspeitos;
	}

	public void setSuspeitos(List<String> suspeitos) {
		this.suspeitos = suspeitos;
	}
	
	public String gerarAssassino() {
		int min = 0;
		int max = 5;

		Random random = new Random();

		int value = random.nextInt(max + min) + min;
		return suspeitos.get(value);
	}

	@Override
	public String toString() {
		String retorno = "Suspeitos: \n";
		for (int i = 0; i < suspeitos.size(); i++) {
			retorno += i+1 + ". " + suspeitos.get(i) + "\n";
		}
		return retorno;
	}
	
}
