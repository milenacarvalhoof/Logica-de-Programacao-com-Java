package diamantes;

import java.util.Scanner;

public class Main {
	
/* Dado uma letra ('A' a 'Z'), exiba um diamante iniciando em 'A' e tendo a letra fornecida com o 
ponto mais distante. Por exemplo, dado a letra 'E' temos:

    A   

   B B

  C   C

 D     D

E       E 

 D     D 

  C   C

   B B

    A 

Dado a letra 'C' temos:

  A

 B B

C   C

 B B

  A  */
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
		String letra = ler.nextLine();
		
		Diamante d1 = new Diamante(letra);
		
		d1.retorno();
		
		ler.close();
	}

}
