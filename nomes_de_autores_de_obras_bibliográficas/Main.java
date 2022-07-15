package nomes_de_autores_de_obras_bibliogr�ficas;

import java.util.Scanner;

public class Main {
	
	/* Quando se lista o nome de autores de livros, artigos e outras publica��es � comum que se apresente 
	o nome do autor ou dos autores da seguinte forma: 
	sobrenome do autor em letras mai�sculas, seguido de uma v�rgula e da primeira parte do nome apenas 
	com as iniciais mai�sculas. Por exemplo:
	SILVA, Joao
	COELHO, Paulo
	ARAUJO, Celso de
	Seu desafio � fazer um programa que leia um n�mero inteiro correspondendo ao n�mero de nomes que ser� 
	fornecido, e, a seguir, leia estes nomes (que podem estar em qualquer tipo de letra) e imprima a vers�o 
	formatada no estilo exemplificado acima.
	As seguintes regras devem ser seguidas nesta formata��o:
	o sobrenome ser� igual a �ltima parte do nome e deve ser apresentado em letras mai�sculas;
	se houver apenas uma parte no nome, ela deve ser apresentada em letras mai�sculas (sem v�rgula): 
	se a entrada for � Guimaraes� , a sa�da deve ser � GUIMARAES�;
	se a �ltima parte do nome for igual a "FILHO", "FILHA", "NETO", "NETA", "SOBRINHO", "SOBRINHA" ou "JUNIOR" 
	e houver duas ou mais partes antes, a pen�ltima parte far� parte do sobrenome. 
	Assim: se a entrada for "Joao Silva Neto", a sa�da deve ser "SILVA NETO, Joao" ; 
	se a entrada for "Joao Neto" , a sa�da deve ser "NETO, Joao";
	as partes do nome que n�o fazem parte do sobrenome devem ser impressas com a inicial mai�scula e com 
	as demais letras min�sculas;
	"da", "de", "do", "das", "dos" n�o fazem parte do sobrenome e n�o iniciam por letra mai�scula. */
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quantos nomes ser�o digitados? ");
		int qtdNomes = ler.nextInt();
		ler.nextLine();
		
		while (qtdNomes > 0) {
			System.out.print("Nome: ");
			String nomeCompleto = ler.nextLine();
			
			Nome nome = new Nome(nomeCompleto);			
			
			System.out.println(nome);
			
			qtdNomes--;
		}
		
		
		ler.close();
	}
}
