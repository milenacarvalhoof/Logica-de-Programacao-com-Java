package buracos_nas_letras;

import java.util.Scanner;

public class Main {
	/* Se voc� pensar em um papel como um plano e uma letra como uma marca��o neste plano, ent�o estas 
	letras dividem o plano em regi�es. 
	Por exemplo, as letras A, D e O dividem o plano em 2 pois possuem um espa�o confinado em seu desenho, 
	ou um �buraco�. Outras letras como B possuem 2 buracos e letras como C e E n�o possuem buracos.
	Deste modo podemos considerar que o n�mero de buracos em um texto � igual a soma dos buracos nas 
	palavras dele.
	A sua tarefa �, dado um texto qualquer, encontre a quantidade de buracos nele. */
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um texto para saber a quantidade de buracos nele:");
		String texto = ler.nextLine();
		
		BuracosNoTexto buracosNoTexto = new BuracosNoTexto(texto);
		
		System.out.println(buracosNoTexto);
		
		ler.close();
	}
}
