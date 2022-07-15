package palavras_primas;

import java.util.Scanner;

public class Main {

	/* Um número primo é definido se ele possuir exatamente dois divisores: 
	o número um e ele próprio. São exemplos de números primos: 2, 3, 5, 101, 367 e 523.
	Neste problema, você deve ler uma palavra composta somente por letras [a-zA-Z]. 
	Cada letra possui um valor específico, 
	a vale 1, b vale 2 e assim por diante, até a letra z que vale 26. 
	Do mesmo modo A vale 27, B vale 28, até a letra Z que vale 52.
	Você precisa definir se cada palavra em um conjunto de palavras é prima ou não. 
	Para ela ser prima, a soma dos valores de suas letras deve ser um número primo. */
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe uma palavra: ");
		String palavra = ler.nextLine();
		
		Palavra palavra2 = new Palavra(palavra);
		
		System.out.println(palavra2);
		
		ler.close();
	}
}
