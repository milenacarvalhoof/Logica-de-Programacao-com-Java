package fizzbuzz;

public class Main {
	/* FizzBuzz
	Neste problema, voc� dever� exibir uma lista de 1 a 100, um em cada linha, com as seguintes exce��es:
	N�meros divis�veis por 3 deve aparecer como 'Fizz' ao inv�s do n�mero;
	N�meros divis�veis por 5 devem aparecer como 'Buzz' ao inv�s do n�mero;
	N�meros divis�veis por 3 e 5 devem aparecer como 'FizzBuzz' ao inv�s do n�mero'. */

	public static void main(String[] args) {
		
		int n = 1;
		
		while (n <= 100) {
			if (n % 3 == 0 && n % 5 == 0) {
				System.out.println("FizzBuzz");
			}else if (n % 3 == 0) {
				System.out.println("Fizz");
			}else if (n % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(n);
			}
			n++;
		}
	}
}
