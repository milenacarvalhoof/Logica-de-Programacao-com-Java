package poker;

public class Main {
	
	/* No jogo de Poker, uma m�o consiste em cinco cartas que podem ser comparadas, da mais baixa para 
	a mais alta, da seguinte maneira:
	Carta Alta: A carta de maior valor.
	Um Par: Duas cartas do mesmo valor.
	Dois Pares: Dois pares diferentes.
	Trinca: Tr�s cartas do mesmo valor e duas de valores diferentes.
	Straight (seq��ncia): Todas as carta com valores consecutivos.
	Flush: Todas as cartas do mesmo naipe.
	Full House: Um trinca e um par.
	Quadra: Quatro cartas do mesmo valor.
	Straight Flush: Todas as cartas s�o consecutivas e do mesmo naipe.
	Royal Flush: A seq��ncia 10, Valete, Dama, Rei, �s, do mesmo naipe.
	As cartas s�o, em ordem crescente de valor: 2, 3, 4, 5, 6, 7, 8, 9, 10, Valete, Dama, Rei, �s.
	Os naipes s�o: Ouro (D), Copa (H), Espadas (S), Paus (C)
	Se dois jogadores possuem a mesma m�o, vence que tiver a m�o formada pelas cartas de maior valor.
	Alguns exemplos de m�o e seus respectivos vencedores:
 	Jogador 1	 		Jogador 2	 		Vencedor
 	
 	5H 5C 6S 7S KD  	2C 3S 8S 8D TD  	Jogador 2
	Par de cinco  		Par de oito    
 	
 	5D 8C 9S JS AC		2C 5C 7D 8S QH		Jogador 1
	Carta mais alta:�s  Carta mais alta:Dama
 	
 	2D 9C AS AH AC		3D 6D 7D TD QD		Jogador 2
	Trinca de �s		Flush com Ouro
 	
 	4D 6S 9H QH QC		3D 6D 7H QD QS		Jogador 1
	Par de Damas		Par de Damas
	Carta mais alta: 9	Carta mais alta: 7
 	
 	2H 2D 4C 4D 4S		3C 3D 3S 9S 9D		Jogador 1
	Full House			Full House
	Com tr�s 4			Com tr�s 3
 	
	Desenvolva um programa que, de acordo com as m�os de dois jogadores, informe qual deles � o vencedor.*/
	
	public static void main(String[] args) {	
		
		Poker poker = new Poker();
		
		System.out.println(poker);
				
	}
}
