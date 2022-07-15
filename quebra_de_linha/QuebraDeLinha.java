package quebra_de_linha;

import java.util.ArrayList;
import java.util.List;

public class QuebraDeLinha {
	
	private int qtdColunas;
	private String[] palavras;
	private List<String> linhas = new ArrayList<>();
	
	public QuebraDeLinha(String frase, int qtdColunas) {
		palavras = frase.split(" ");
		this.qtdColunas = qtdColunas;		
	}
	
	public void quebraDeLinha() {
		String linha = "";
		for (String string : palavras) {
			if (linha.length() + string.length() <= qtdColunas) {
				linha += string + " ";				
			}else {
				linhas.add(linha);
				linha = string + " ";
			}
		}		
		linhas.add(linha);
	}

	public void retorno() {
		quebraDeLinha();
		for (String string : linhas) {
			System.out.println(string);
		}
	}	

}
