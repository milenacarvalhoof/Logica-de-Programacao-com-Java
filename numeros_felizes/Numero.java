package numeros_felizes;

public class Numero {
	
	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}
	
	public boolean numeroFeliz() {
		if (numero < 10) {
			numero = numero * numero;			
		}
		
		while (numero > 9) {
			String numeroAoQuadrado = numero + "";		
			String array[] = numeroAoQuadrado.split("");
			
			int soma = 0;
			
			for (String string : array) {
				int n = Integer.parseInt(string);
				int nq = n * n;
				soma += nq;
			}
			numero = soma;
		}
		
		if (numero == 1) {
			return true;
		}else {
			return false;				
		}
	}
	
	public String retorno() {
		if (numeroFeliz()) {
			return "Número Feliz";
		}else {
			return "Número Triste";
		}
	}

}
