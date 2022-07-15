package jokenpo;

import java.util.Scanner;

public class Main {
	/* Jokenpo � uma brincadeira japonesa, onde dois jogadores escolhem um dentre tr�s poss�veis itens: 
	Pedra, Papel ou Tesoura. 
	O objetivo � fazer um juiz de Jokenpo que dada a jogada dos dois jogadores informa o resultado da partida.
	As regras s�o as seguintes:
	Pedra empata com Pedra e ganha de Tesoura
	Tesoura empata com Tesoura e ganha de Papel
	Papel empata com Papel e ganha de Pedra */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Pedra, Papel ou Tesoura\n");
		
		System.out.print("Jogador 1: ");
		String jogador1 = ler.nextLine();
		
		System.out.print("Jogador 2: ");
		String jogador2 = ler.nextLine();
		
		Jokenpo jokenpo = new Jokenpo(jogador1, jogador2);
		
		System.out.println(jokenpo);
		
		ler.close();
	}
}
