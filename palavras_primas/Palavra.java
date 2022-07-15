package palavras_primas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Palavra {
	
	private String[] arrayLetras;
	List<Integer> numeros = new ArrayList<>();

	public Palavra(String palavra) {
		arrayLetras = palavra.split("");
		numerosDeLetrasMinusculas();
		numerosDeLetrasMaiusculas();
		adcNumeros();
		numeroSoma();
	}
	
	Function<String, Character> transformarLetrasEmCharacters = s -> s.charAt(0);
	
	Predicate<Character> somenteMinusculas = c -> Character.isLowerCase(c);
	
	Predicate<Character> somenteMaiusculas = c -> Character.isUpperCase(c);
	
	Function<Character, Integer> transformarCharactersMinusculasEmNumeros = s -> s - 'a' + 1;
	
	Function<Character, Integer> transformarCharactersMaiusculasEmNumeros = s -> s - 'A' + 27;
	
	BinaryOperator<Integer> soma = (x, y) -> x + y;
	
	public List<Integer> numerosDeLetrasMinusculas() {
		List<Integer> numerosDeLetrasMinusculas = Arrays.stream(arrayLetras)
				.map(transformarLetrasEmCharacters)
				.filter(somenteMinusculas)
				.map(transformarCharactersMinusculasEmNumeros)
				.collect(Collectors.toList());
		return numerosDeLetrasMinusculas;
	}
	
	public List<Integer> numerosDeLetrasMaiusculas() {
		List<Integer> numerosDeLetrasMaiusculas = Arrays.stream(arrayLetras)
				.map(transformarLetrasEmCharacters)
				.filter(somenteMaiusculas)
				.map(transformarCharactersMaiusculasEmNumeros)
				.collect(Collectors.toList());
		return numerosDeLetrasMaiusculas;
	}	
	
	public void adcNumeros() {
		for (Integer numero : numerosDeLetrasMinusculas()) {
			numeros.add(numero);
		}
		
		for (Integer numero : numerosDeLetrasMaiusculas()) {
			numeros.add(numero);
		}
	}
	
	public Integer numeroSoma() {		
		return numeros.stream().reduce(soma).get();		
	}
	
	public boolean numeroPrimo() {		
		int cont = 0;
		
		for (int i = 1; i <= numeroSoma(); i++) {						
			if (numeroSoma() % i == 0) {
				cont++;
			}			
		}
		
		if (cont == 2) {
			return true;
		} else {
			return false;
		}		
	}
	
	@Override
	public String toString() {
		if (numeroPrimo()) {
			return numeroSoma() + ": Palavra Prima";
		}else {
			return numeroSoma() + ": Não é Palavra Prima";
		}
	}
}
