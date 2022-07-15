package quebra_de_linha;

import java.util.Scanner;

public class Main {
	
	/* Escreva um programa em que dado uma frase e a quantidade de colunas que podem ser exibidas na tela, 
	faça a quebra de linhas sem quebrar as palavras.
	Por exemplo, se passarmos a frase "Um pequeno jabuti xereta viu dez cegonhas felizes." 
	e pedirmos para ela ser exibida em 20 colunas, teremos como resposta:
	Um pequeno jabuti
	xereta viu dez
	cegonhas felizes. */
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = ler.nextLine();
		
		System.out.print("Qual a quantidade máxima de colunas que podem ser exibidas na tela? ");
		int qtdColunas = ler.nextInt();
		
		QuebraDeLinha quebraDeLinha = new QuebraDeLinha(frase, qtdColunas);
		
		quebraDeLinha.retorno();
		
		ler.close();
	}

}
