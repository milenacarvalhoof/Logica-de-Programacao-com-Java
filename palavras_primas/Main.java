package palavras_primas;

import java.util.Scanner;

public class Main {

	/* Um n�mero primo � definido se ele possuir exatamente dois divisores: 
	o n�mero um e ele pr�prio. S�o exemplos de n�meros primos: 2, 3, 5, 101, 367 e 523.
	Neste problema, voc� deve ler uma palavra composta somente por letras [a-zA-Z]. 
	Cada letra possui um valor espec�fico, 
	a vale 1, b vale 2 e assim por diante, at� a letra z que vale 26. 
	Do mesmo modo A vale 27, B vale 28, at� a letra Z que vale 52.
	Voc� precisa definir se cada palavra em um conjunto de palavras � prima ou n�o. 
	Para ela ser prima, a soma dos valores de suas letras deve ser um n�mero primo. */
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe uma palavra: ");
		String palavra = ler.nextLine();
		
		Palavra palavra2 = new Palavra(palavra);
		
		System.out.println(palavra2);
		
		ler.close();
	}
}
