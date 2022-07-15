package caixa_eletronico;

public class Saque {
	
	private int valorSaque;
	private int qtdNotas100;
	private int qtdNotas50;
	private int qtdNotas20;
	private int qtdNotas10;
	
	public Saque(int valorSaque) {
		this.valorSaque = valorSaque;
	}
	
	public void definindoQtdNotas() {
		if (valorSaque >= 100) {
			qtdNotas100 = valorSaque / 100;	
			valorSaque = valorSaque % 100;
		}
		if (valorSaque >= 50) {
			qtdNotas50 = valorSaque / 50;	
			valorSaque = valorSaque % 50;
		}
		if (valorSaque >= 20) {
			qtdNotas20 = valorSaque / 20;	
			valorSaque = valorSaque % 20;
		}	
		if (valorSaque == 10) {
			qtdNotas10 = valorSaque / 10;
		}	
	}
	
	public String retorno() {
		this.definindoQtdNotas();
		String retorno = "";
		if (qtdNotas100 > 0) {
			retorno += qtdNotas100 + " Nota(s) de R$100. \n";
		}
		if (qtdNotas50 > 0) {
			retorno += qtdNotas50 + " Nota(s) de R$50. \n";
		}
		if (qtdNotas20 > 0) {
			retorno += qtdNotas20 + " Nota(s) de R$20. \n";
		}
		if (qtdNotas10 > 0) {
			retorno += qtdNotas10 + " Nota(s) de R$10. \n";
		}
		return retorno;
	}

	@Override
	public String toString() {		
		return this.retorno();
	}
}
