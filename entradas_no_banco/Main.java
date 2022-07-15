package entradas_no_banco;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
	
	/* Todas as vezes que algu�m passa na porta do maior banco da cidade de Piren�polis, 
	� gravado em um arquivo de log a data e a hora da abertura da porta.
	Cada registro no arquivo de log possui o seguinte formato:
	[YYYY-mm-dd H:i:s] - Abertura da Porta OK.
	O gerente do banco precisa saber quantas pessoas entraram no banco no hor�rio de expediente, 
	para isso ele solicitou que voc� fa�a um programa que verifique se o registro de entrada � 
	v�lido e se a hora se encontra dentro do intervalo de funcionamento do banco, 
	das 10:00:00 at� as 16:00:00. */

	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Data: ");
		String data = ler.nextLine();
		String[] array1 = data.split("/");
		
		System.out.print("Hora: ");
		String horas = ler.nextLine();
		String[] array2 = horas.split(":");

		
		int dia = Integer.parseInt(array1[0]);
		int mes = Integer.parseInt(array1[1]);
		int ano = Integer.parseInt(array1[2]);
		
		int hora = Integer.parseInt(array2[0]);
		int minuto = Integer.parseInt(array2[1]);
		int segundo = Integer.parseInt(array2[2]);
		
		Registro registro = new Registro(LocalDateTime.of(ano, mes, dia, hora, minuto, segundo));
		
		System.out.println(registro);
		
		ler.close();
	}

}
