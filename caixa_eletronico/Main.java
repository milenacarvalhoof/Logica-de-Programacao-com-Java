package caixa_eletronico;

import java.util.Scanner;

public class Main {
	/* Desenvolva um programa que simule a entrega de notas quando um cliente efetuar um saque em um caixa
	eletr�nico. Os requisitos b�sicos s�o os seguintes:
	Entregar o menor n�mero de notas;
	� poss�vel sacar o valor solicitado com as notas dispon�veis;
	Saldo do cliente infinito;
	Quantidade de notas infinito (pode-se colocar um valor finito de c�dulas para aumentar a dificuldade do problema);
	Notas dispon�veis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00
	Exemplos:
	Valor do Saque: R$ 30,00 � Resultado Esperado: Entregar 1 nota de R$20,00 e 1 nota de R$ 10,00.
	Valor do Saque: R$ 80,00 � Resultado Esperado: Entregar 1 nota de R$50,00 1 nota de R$ 20,00 e 1 nota de R$ 10,00. */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual o valor do saque? R$");
		int valor = ler.nextInt();
	
		Saque saque = new Saque(valor);
		
		System.out.println(saque);		
		
		ler.close();
	}
}
