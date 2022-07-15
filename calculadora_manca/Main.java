package calculadora_manca;

import java.util.Scanner;

public class Main {
	/* Partindo do pressuposto que em uma calculadora existem apenas as fun��es de soma e invers�o. 
	Fa�a as opera��es de subtra��o, divis�o, multiplica��o, pot�ncia e radicia��o usando, 
	primeiramente as fun��es iniciais e, posteriormente, as fun��es que voc� criar. 
	Exemplo: soma(x, y) -> x + y invers�o(x) -> -x subtra��o(x, y) -> soma(x, invers�o(y)) */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.divisao(10, 2));
		
		ler.close();		
	}
}
