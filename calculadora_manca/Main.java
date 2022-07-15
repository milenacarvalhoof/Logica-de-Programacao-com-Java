package calculadora_manca;

import java.util.Scanner;

public class Main {
	/* Partindo do pressuposto que em uma calculadora existem apenas as funções de soma e inversão. 
	Faça as operações de subtração, divisão, multiplicação, potência e radiciação usando, 
	primeiramente as funções iniciais e, posteriormente, as funções que você criar. 
	Exemplo: soma(x, y) -> x + y inversão(x) -> -x subtração(x, y) -> soma(x, inversão(y)) */
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.divisao(10, 2));
		
		ler.close();		
	}
}
