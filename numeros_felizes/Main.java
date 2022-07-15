package numeros_felizes;

import java.util.Scanner;

public class Main {
	
	/* Para saber se um n�mero � feliz, voc� deve obter o quadrado de cada d�gito deste n�mero, 
	em seguida voc� faz a soma desses resultados. 
	A seguir o mesmo procedimento deve ser feito com o valor resultante desta soma. 
	Se ao repetir o procedimento diversas vezes obtivermos o valor 1, o n�mero inicial � considerado feliz.
	Tomamos o 7, que � um n�mero feliz:
	7� = 49
	4� + 9� = 97
	9� + 7� = 130
	1� + 3� + 0� = 10
	1� + 0� = 1
	Podemos observar nesse exemplo que os n�meros 49, 97, 130 e 10 tamb�m s�o felizes. 
	Existem infinitos n�meros felizes.
	E um n�mero triste? Como sabemos que um n�mero n�o ser� feliz?
	Desenvolva um programa que determine se um n�mero � feliz ou triste. */
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = ler.nextInt();
		
		Numero numeroFeliz = new Numero(numero);
		
		System.out.println(numeroFeliz.retorno());
		
		ler.close();
	}
}
