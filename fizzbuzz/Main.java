package fizzbuzz;

public class Main {
	/* FizzBuzz
	Neste problema, você deverá exibir uma lista de 1 a 100, um em cada linha, com as seguintes exceções:
	Números divisíveis por 3 deve aparecer como 'Fizz' ao invés do número;
	Números divisíveis por 5 devem aparecer como 'Buzz' ao invés do número;
	Números divisíveis por 3 e 5 devem aparecer como 'FizzBuzz' ao invés do número'. */

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
