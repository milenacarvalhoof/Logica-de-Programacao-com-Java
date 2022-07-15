package poker;

import java.util.stream.Collectors;

public class Poker {
	
	Jogador jogador1 = new Jogador("Jogador 1");
	Jogador jogador2 = new Jogador("Jogador 2");
	
	public Poker() {
		System.out.println(jogador1);
		System.out.println(jogador2);
	}
		
	public String vencedor() {
		String vencedor = "";
		jogador1.getMao().stream().filter(m -> m.equals(true)).collect(Collectors.toList());
		for (int i = 1; i < 10; i++) {
			if (jogador1.getMao().get(i) && jogador2.getMao().get(i)) {
				if (jogador1.carta.getValor().ordinal() > jogador2.carta.getValor().ordinal()) {
					vencedor = "Vencedor: Jogador 1";
				}else if (jogador1.carta.getValor().ordinal() < jogador2.carta.getValor().ordinal()) {
					vencedor = "Vencedor: Jogador 2";
				}else if (jogador1.cartaAlta().getValor().ordinal() > jogador2.cartaAlta().getValor().ordinal()) {
					vencedor = "Vencedor: Jogador 1";
				}else if (jogador1.cartaAlta().getValor().ordinal() < jogador2.cartaAlta().getValor().ordinal()) {
					vencedor = "Vencedor: Jogador 2";
				}else {
					vencedor = "Empate";
				}
			}else if (jogador1.getMao().get(i) && !jogador2.getMao().get(i)) {
				vencedor = "Vencedor: Jogador 1";
			}else if (!jogador1.getMao().get(i) && jogador2.getMao().get(i)) {
				vencedor = "Vencedor: Jogador 2";
			}else if (jogador1.cartaAlta().getValor().ordinal() > jogador2.cartaAlta().getValor().ordinal()) {
				vencedor = "Vencedor: Jogador 1";
			}else if (jogador1.cartaAlta().getValor().ordinal() < jogador2.cartaAlta().getValor().ordinal()) {
				vencedor = "Vencedor: Jogador 2";
			}else {
				vencedor = "Empate";
			} 
		}
		return vencedor;
	}

	@Override
	public String toString() {
		return this.vencedor();
	}
	
	

}
