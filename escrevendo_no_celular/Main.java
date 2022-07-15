package escrevendo_no_celular;

import java.util.Scanner;

public class Main {
	
	/* Um dos servi�os mais utilizados pelos usu�rios de aparelhos celulares s�o os SMS (Short Message Service), 
	que permite o envio de mensagens curtas (at� 255 caracteres em redes GSM e 160 caracteres em redes CDMA).
	Para digitar uma mensagem em um aparelho que n�o possui um teclado QWERTY embutido � necess�rio fazer 
	algumas combina��es das 10 teclas num�ricas do aparelho para conseguir digitar. Cada n�mero � 
	associado a um conjunto de letras como a seguir:
	Letras ->  N�mero 
	ABC    ->  	2 
	DEF    ->  	3 
	GHI    ->  	4 
	JKL    ->  	5 
	MNO    ->  	6 
	PQRS   ->  	7 
	TUV    ->  	8 
	WXYZ   ->  	9 
	Espa�o -> 	0 
	Desenvolva um programa que, dada uma mensagem de texto limitada a 255 caracteres, retorne a seq��ncia 
	de n�meros que precisa ser digitada. 
	Uma pausa, para ser poss�vel obter duas letras referenciadas pelo mesmo n�mero, deve ser indicada como _.
	Por exemplo, para digitar "SEMPRE ACESSO O DOJOPUZZLES", voc� precisa digitar:
	77773367_7773302_222337777_777766606660366656667889999_9999555337777 */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a mensagem:");
		String mensagem = ler.nextLine();
		
		SMS sms = new SMS(mensagem);
		
		for (String string : sms.digitos()) {
			System.out.print(string);			
		}		
		
		ler.close();
	}
}
