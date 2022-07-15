package diamantes;

import java.util.ArrayList;
import java.util.List;

public class Diamante {
	
	private char letra;

	public Diamante(String letra) {
		this.letra = letra.charAt(0);
	}
	
	public void retorno() {
		List<String> lista = new ArrayList<>();
		
		Integer n = letra - 'a' + 1;	
		
		int qtdEspacoMeio = 1;
		
		int m = 0;
		
		for (int i = 2; i < n; i++) {
			qtdEspacoMeio += 2;
		}
		
		int qtdEspacoAnterior = qtdEspacoMeio / 2;
		
		if (qtdEspacoMeio % 2 != 0) {
			qtdEspacoAnterior++;
		}
		
		for (char c = 'a'; c <= letra; c++) {
			String espacoAnterior = "";
			String espacoMeio = "";
			String string;
			for (int i = 0; i < qtdEspacoAnterior; i++) {
				espacoAnterior += " ";
			}
			if (c == 'a') {
				string = espacoAnterior + Character.toUpperCase(c);				
				qtdEspacoAnterior--;				
			}else {
				qtdEspacoMeio = 1 + m;				
				for (int i = 0; i < qtdEspacoMeio; i++) {
					espacoMeio += " ";
				}
				string = espacoAnterior + Character.toUpperCase(c) + espacoMeio + Character.toUpperCase(c);
				m += 2;	
				qtdEspacoAnterior--;
			}
			lista.add(string);
		}
		
		for (String string : lista) {
			System.out.println(string);
		}
		for (int i = lista.size() - 2; i >= 0; i--) {
			System.out.println(lista.get(i));
		}
	}

}
