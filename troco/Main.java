package troco;

import java.util.Scanner;

public class Main {
	/* Funcion�rios de empresas comerciais que trabalham como caixa tem uma grande responsabilidade em 
	suas m�os. A maior parte do tempo de seu expediente de trabalho � gasto recebendo valores de clientes 
	e, em alguns casos, fornecendo troco.
	Seu desafio � fazer um programa que leia o valor total a ser pago e o valor efetivamente pago, 
	informando o menor n�mero de c�dulas e moedas que devem ser fornecidas como troco.
	Deve-se considerar que h�:
	c�dulas de R$100,00, R$50,00, R$10,00, R$5,00 e R$1,00;
	moedas de R$0,50, R$0,10, R$0,05 e R$0,01. */
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor total: R$");
		double valorTotal = ler.nextDouble();
		
		System.out.print("Informe o pagamento: R$");
		double pagamento = ler.nextDouble();
		
		Troco troco = new Troco(valorTotal, pagamento);
		
		System.out.println(troco);
		
		ler.close();
	}
}
