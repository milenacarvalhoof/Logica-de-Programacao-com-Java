package descubra_o_assassino;

import java.util.Scanner;

public class Main {
	
	/* O empres�rio Bill G. Ates foi assassinado e o corpo dele foi deixado na frente da delegacia de pol�cia.
	O detetive Lin Ust Orvalds foi escolhido para investigar este caso. 
	Ap�s uma s�rie de investiga��es, ele organizou uma lista com prov�veis assassinos,
	os locais do crime e quais armas poderiam ter sido utilizadas.
	Suspeitos:
		Charles B. Abbage
		Donald Duck Knuth
		Ada L. Ovelace
		Alan T. Uring
		Ivar J. Acobson
		Ras Mus Ler Dorf
	Locais:
		Redmond
		Palo Alto
		San Francisco
		Tokio
		Restaurante no Fim do Universo
		S�o Paulo
		Cupertino
		Helsinki
		Maida Vale
		Toronto
	Armas:
		Peixeira
		DynaTAC 8000X (o primeiro aparelho celular do mundo)
		Trezoit�o
		Trebuchet
		Ma�a
		Gl�dio
	Uma testemunha foi encontrada, mas ela s� consegue responder se Lin fornecer uma teoria. 
	Para cada teoria ele "chuta" um assassino, um local e uma arma. 
	A testemunha ent�o responde com um n�mero. 
	Se a teoria estiver correta (assassino, local e arma corretos), ela responde 0. 
	Se a teoria est� errada, um valor 1,2 ou 3 � retornado. 
	1 indica que o assassiona est� incorreto; 
	2 indica que o local est� incorreto; 
	3 indica que a arma est� incorreta. 
	Se mais de uma suposi��o est� incorreta, ela retorna um valor arbitr�rio entre as que est�o 
	incorretos (isso � totalmente aleat�rio).

	Por exemplo, se o assassino for Donald Duck Knuth usando um trezoit�o em Tokio:
	Teoria: 1, 1, 1
	Retorno: 1, ou 2, ou 3 (todos est�o incorretos) 
	Teoria: 3, 1, 3
	Retorno: 1, ou 3 (somente o local est� correto)
	Teoria: 5, 3, 4
	Retorno: 1 (somente o assassino est� incorreto)
	Teoria: 2, 3, 4
	Retorno: 0 (todos corretos, voc� solucionou o caso)
	Voc� precisa desenvolver um programa que tente resolver o problema. 
	Inicialmente n�o se preocupe no n�mero de tentativas necess�rio para encontrar a solu��o. 
	Depois tente melhorar a maneira com que as teorias s�o testadas para que Lin 
	encontre a solu��o do problema no menor n�mero de tentativas. */
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Crime crime = new Crime();
		
		System.out.println(crime.getSuspeitos());
		System.out.println(crime.getLocais());
		System.out.println(crime.getArmas());
		System.out.println("Informe a sua teoria. Exemplo: 1, 2, 3");
		do {			
			System.out.print("Teoria: ");
			
			String teoria = ler.nextLine();			
			String[] array = teoria.split(", ");
						
			int assassino = Integer.parseInt(array[0]);
			int local = Integer.parseInt(array[1]);
			int arma = Integer.parseInt(array[2]);
			
			System.out.println(crime.teoria(assassino, local, arma));
			
		} while (!crime.teoriaCerta());
		
		ler.close();
	}

}
