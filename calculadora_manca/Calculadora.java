package calculadora_manca;

public class Calculadora {
	
	public double somar(double x, double y) {
		return x+y;
	}
	
	public double inversao(double x) {
		return x - x*2;
	}
	
	public double subtracao(double x, double y) {
		return somar(x, inversao(y));
	}
	
	public double multiplicacao(double x, double y) {
		
		double resultado = 0;		
		for (int i = 0; i < x; i++) {
			resultado = somar(resultado, y);
		}		
		return resultado;
	}
	
	public double divisao(double x, double y) {
		
		double resultado = 0;
		
		for (int i = 1; i < x; i++) {
			double d = 0;
			if (multiplicacao(y, i) == x) {
				resultado = i;
			}
		}
		
		return resultado;
	}

}
