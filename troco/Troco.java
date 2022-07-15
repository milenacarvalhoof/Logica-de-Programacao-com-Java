package troco;

public class Troco {
	
	private double valorTotal;
	private double pagamento;
	
	public Troco(double valorTotal, double pagamento) {
		this.valorTotal = valorTotal;
		this.pagamento = pagamento;
	}
	
	public String troco() {
		double troco = pagamento - valorTotal;
				
		int cedulas100 = (int)troco / 100;
		troco -= cedulas100 * 100;
		
		int cedulas50 = (int)troco / 50;
		troco -= cedulas50 * 50;
		
		int cedulas10 = (int)troco / 10;
		troco -= cedulas10 * 10;
		
		int cedulas5 = (int)troco / 5;
		troco -= cedulas5 * 5;
		
		int cedulas1 = (int)troco / 1;
		troco -= cedulas1;
		
		double moedas50 = troco / 0.50;
		troco -= (int)moedas50 * 0.50;
		
		double moedas10 = troco / 0.10;
		troco -= (int)moedas10 * 0.10;
		
		double moedas5 = troco / 0.05;
		troco -= (int)moedas5 * 0.05; 
		
		double moedas1 = troco / 0.01;
				
		String retorno = "";
		if (cedulas100 >= 1) {
			retorno += cedulas100 + " Cedula(s) de R$ 100,00\n";
		}
		if (cedulas50 >= 1) {
			retorno += "1 Cedula de R$ 50,00\n";
		}
		if (cedulas10 >= 1) {
			retorno += cedulas10 + " Cedula(s) de R$ 10,00\n";
		}
		if (cedulas5 >= 1) {
			retorno += "1 Cedula de R$ 5,00\n";
		}
		if (cedulas1 >= 1) {
			retorno += cedulas1 + " Cedula(s) de R$ 1,00\n";
		}
		if (moedas50 >= 1) {
			retorno += "1 Moeda de R$ 0,50\n";
		}
		if (moedas10 >= 1) {
			retorno += (int)moedas10 + " Moeda(s) de R$ 0,10\n";
		}
		if (moedas5 >= 1) {
			retorno += "1 Moeda(s) de R$ 0,05\n";
		}
		if (moedas1 >= 1) {
			retorno += (int)moedas1 + " Moeda(s) de R$ 0,01\n";
		}
		return retorno;
	}

	@Override
	public String toString() {
		return "Troco: \n" + troco();
	}

}
