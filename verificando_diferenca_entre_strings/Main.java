package verificando_diferenca_entre_strings;

import java.util.Scanner;

public class Main {
	/* Fa�a um programa que destaque a diferen�a entre duas string. 
	Exemplo: Entradas: O p�ssaro amarelo caiu. O p�ssaro vermelho caiu. 
	Sa�das: O p�ssaro [amarel]o caiu. O p�ssaro [vermelh]o caiu. */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe duas strings para saber a diferen�a entre elas:");
		System.out.print("String 1: ");
		String string1 = ler.nextLine();
		
		System.out.print("String 2: ");
		String string2 = ler.nextLine();
		
		Comparacao c1 = new Comparacao(string1, string2);
		
		System.out.println(c1);		
		
		ler.close();
	}
}
