package buracos_nas_letras;

import java.util.Arrays;

public class BuracosNoTexto {

	private String[] texto;
	
	public BuracosNoTexto(String texto) {
		this.texto = texto.split("");
	}
	
	public long buracos() {
		
		long countA = Arrays.stream(texto).filter(s -> s.equalsIgnoreCase("A")).count();
		long countQ = Arrays.stream(texto).filter(s -> s.equalsIgnoreCase("Q")).count();
		long countO = Arrays.stream(texto).filter(s -> s.equalsIgnoreCase("O")).count();
		long countP = Arrays.stream(texto).filter(s -> s.equalsIgnoreCase("P")).count();
		long countD = Arrays.stream(texto).filter(s -> s.equalsIgnoreCase("D")).count();
		long count_R = Arrays.stream(texto).filter(s -> s.equals("R")).count();
		long count_b = Arrays.stream(texto).filter(s -> s.equals("b")).count();
		long count_e = Arrays.stream(texto).filter(s -> s.equals("e")).count();
		
		long count_g = Arrays.stream(texto).filter(s -> s.equals("g")).count();
		long count_B = Arrays.stream(texto).filter(s -> s.equals("B")).count();
		
		long cont1 = countA + countQ + count_R + countO + countP + countD + count_b + count_e;
		long cont2 = count_g * 2 + count_B * 2;
		
		long total = cont1 + cont2;
		
		return total;
	}

	@Override
	public String toString() {
		return "Buracos no texto = " + buracos();
	}

}
