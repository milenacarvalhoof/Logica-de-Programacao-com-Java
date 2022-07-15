package ano_bissexto;

import java.util.Scanner;

public class Main {
	/* A cada 4 anos, a diferen�a de horas entre o ano solar e o do calend�rio convencional completa 
	cerca de 24 horas (mais exatamente: 23 horas, 15 minutos e 864 mil�simos de segundo). 
	Para compensar essa diferen�a e evitar um descompasso em rela��o �s esta��es do ano, insere-se um 
	dia extra no calend�rio e o m�s de fevereiro fica com 29 dias. Essa corre��o � especialmente 
	importante para atividades atreladas �s esta��es, como a agricultura e at� mesmo as festas religiosas.
	Um determinado ano � bissexto se:
	O ano for divis�vel por 4, mas n�o divis�vel por 100, exceto se ele for tamb�m divis�vel por 400.
	Exemplos:
	1600, 1732, 1888, 1944, 2008
	N�o s�o bissextos por exemplo:
	1742, 1889, 1951, 2011
	Escreva uma fun��o que determina se um determinado ano informado � bissexto ou n�o. */
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe um ano para saber se � bissexto: ");
		int ano = ler.nextInt();
		
		AnoBissexto anoBissexto = new AnoBissexto(ano);
		
		System.out.println(anoBissexto);		
		
		ler.close();	
	}
}
