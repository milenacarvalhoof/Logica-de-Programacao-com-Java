package verificando_diferenca_entre_strings;

import java.util.Scanner;

public class Main {
	/* Faça um programa que destaque a diferença entre duas string. 
	Exemplo: Entradas: O pássaro amarelo caiu. O pássaro vermelho caiu. 
	Saídas: O pássaro [amarel]o caiu. O pássaro [vermelh]o caiu. */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe duas strings para saber a diferença entre elas:");
		System.out.print("String 1: ");
		String string1 = ler.nextLine();
		
		System.out.print("String 2: ");
		String string2 = ler.nextLine();
		
		Comparacao c1 = new Comparacao(string1, string2);
		
		System.out.println(c1);		
		
		ler.close();
	}
}
