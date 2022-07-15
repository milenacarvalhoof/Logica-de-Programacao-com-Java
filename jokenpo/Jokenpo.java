package jokenpo;

public class Jokenpo {
	
	private String jogador1;
	private String jogador2;
	
	public Jokenpo(String jogador1, String jogador2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}
	
	public String vencedor() {
		String vencedor;
		if (jogador1.equalsIgnoreCase(jogador2)) {
			vencedor = "Empate";
		}else if (jogador1.equalsIgnoreCase("pedra")) {
			
			if (jogador2.equalsIgnoreCase("tesoura")) {
				vencedor = "Jogador 1";
			}else {
				vencedor = "Jogador 2";
			}
			
		}else if (jogador1.equalsIgnoreCase("papel")) {
			
			if (jogador2.equalsIgnoreCase("tesoura")) {
				vencedor = "Jogador 2";
			}else {
				vencedor = "Jogador 1";
			}
			
		}else {
			
			if (jogador2.equalsIgnoreCase("pedra")) {
				vencedor = "Jogador 2";
			}else {
				vencedor = "Jogador 1";
			}
			
		}
		return vencedor;
	}

	@Override
	public String toString() {
		return "Vencedor: " + this.vencedor();
	}
}
