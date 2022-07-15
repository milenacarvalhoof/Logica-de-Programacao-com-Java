package poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Jogador {
	
	private String nome;
	private List<Carta> cartas = new ArrayList<>();
	private List<Boolean> mao = Arrays.asList(false, false, false, false, false, false, false, false, false, false);
	
	public Jogador(String nome) {
		this.nome = nome;
		gerarCartas();
		Collections.sort(cartas);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}

	public List<Boolean> getMao() {
		return mao;
	}

	public void setMao(List<Boolean> mao) {
		this.mao = mao;
	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	public void gerarCartas() {
		for (int i = 0; i < 5; i++) {
			Random random = new Random();
			int indiceValor = random.nextInt(12) + 0;	
			int indiceNaipe = random.nextInt(3) + 0;	
			cartas.add(new Carta(Valor.values()[indiceValor], Naipe.values()[indiceNaipe]));
			Collections.sort(cartas);
		}
	}
	
	public Carta cartaAlta() {		
		return cartas.get(4);
	}
	
	Carta carta = new Carta(null, null);
	public int pares() {
		int cont = 1;
		int pares = 0;
		for (int i = 0; i < cartas.size(); i++) {
			for (int j = i + 1; j < cartas.size(); j++) {
				if (cartas.get(i).getValor() == cartas.get(j).getValor()) {
					cont++;
				}
			}
			if (cont == 2) {
				pares++;
				cont = 1;
				carta = cartas.get(i);
			}
		}
		return pares;
	}
	
	public Valor umPar() {
		if (this.pares() == 1) {
			this.mao.set(1, true);
		}
		return carta.getValor();
	}
	
	public void doisPares() {		
		if (this.pares() == 2) {
			this.mao.set(2, true);
		}
	}
	
	public Valor trinca() {
		int cont = 1;
		int n = 0;
		for (int i = 0; i < cartas.size(); i++) {
			for (int j = i + 1; j < cartas.size(); j++) {
				if (cartas.get(i).getValor().ordinal() == cartas.get(j).getValor().ordinal()) {
					cont++;
					n = i;
				}
			}
			if (cont == 3) {
				this.mao.set(3, true);
				carta = cartas.get(n);
			}else {
				cont = 1;
			}
		}
		return carta.getValor();
	}
	
	public void straight() {
		Carta primeiraCarta = cartas.get(0);		
		mao.set(4, true);			
		for (Carta carta : cartas) {
			if ((carta.getValor().ordinal() + 1) < primeiraCarta.getValor().ordinal() || (carta.getValor().ordinal() + 1) > primeiraCarta.getValor().ordinal() + 2) {
				mao.set(4, false);
			}
			primeiraCarta = carta;
		}			
	}
	
	public Naipe flush() {
		Carta primeiraCarta = cartas.get(0);
		mao.set(5, true);
		for (Carta carta : cartas) {
			if (!carta.getNaipe().equals(primeiraCarta.getNaipe())) {
				mao.set(5, false);
			}
		}
		return primeiraCarta.getNaipe();
	}
	
	public Valor fullHouse() {
		if (mao.get(3).equals(true) && mao.get(1).equals(true)) {
			mao.set(6, true);
		} 
		return trinca();
	}
	
	public Valor quadra() {		
		Carta primeiraCarta = cartas.get(0);
		Carta segundaCarta = cartas.get(1);
		
		int contPrimeira = 0;
		int contSegunda = 0;
		
		for (Carta carta : cartas) {
			if (carta.getValor().equals(primeiraCarta.getValor())) {
				contPrimeira++;
			}else if (carta.getValor().equals(segundaCarta.getValor())) {
				contSegunda++;
			}
		}
		if (contPrimeira == 4) {
			mao.set(7, true);
			carta = primeiraCarta;
		}else if(contSegunda == 4) {
			mao.set(7, true);
			carta = segundaCarta;
		}
		return carta.getValor();
	}
	
	public Naipe straightFlush() {			
		
		if (mao.get(4) && mao.get(5)) {
			mao.set(8, true);
		}

		return this.flush();			
	}
	
	public Naipe royalFlush() {	
		
		boolean dez = false;
		boolean valete = false;
		boolean dama = false;
		boolean rei = false;
		boolean as = false;
		
		for (Carta carta : cartas) {
			if (carta.getValor().equals(Valor.dez)) {
				dez = true;
			}
			if (carta.getValor().equals(Valor.J)) {
				valete = true;
			}
			if (carta.getValor().equals(Valor.Q)) {
				dama = true;
			}
			if (carta.getValor().equals(Valor.K)) {
				rei = true;
			}
			if (carta.getValor().equals(Valor.AS)) {
				as = true;
			}
		}	
		
		if (mao.get(5).equals(true) && dez && valete && dama && rei && as) {
			mao.set(9, true);			
		}
		return this.flush();	
	}
	
	public String mao() {
		if (mao.get(9)) {
			return "Royal Flush de " + this.royalFlush();
		}else if (mao.get(8)) {
			return "Straight Flush de " + this.straightFlush();
		}else if (mao.get(7)) {
			return "Quadra de " + this.quadra();
		}else if (mao.get(6)) {
			return "Full House de " + this.fullHouse();
		}else if (mao.get(5)) {
			return "Flush de " + this.flush();
		}else if (mao.get(4)) {
			this.straight();
			return "Straight";
		}else if (mao.get(3)) {
			return "Trinca de " + this.trinca();
		}else if (mao.get(2)) {
			this.doisPares();
			return "Dois Pares";
		}else if (mao.get(1)) {
			return "Par de " + this.umPar();
		}else {
			return "Carta Alta: " + cartaAlta();
		}
	}

	@Override
	public String toString() {
		return nome + ": " + cartas + " - " + mao();
	}
	
	
}
