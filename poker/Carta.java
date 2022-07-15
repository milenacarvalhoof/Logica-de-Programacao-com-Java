package poker;

public class Carta implements Comparable<Carta>{
	
	private Valor valor;
	private Naipe naipe;
	
	public Carta(Valor valor, Naipe naipe) {
		this.valor = valor;
		this.naipe = naipe;
	}
	
	public String getCarta() {
		return getValor().name() + getNaipe().name();
	}
	
	public Valor getValor() {
		return valor;
	}

	public void setValor(Valor valor) {
		this.valor = valor;
	}

	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}

	@Override
	public String toString() {
		if (valor.ordinal() > 8) {
			return valor.name() + naipe.name();
		}else {
			return (valor.ordinal() + 2) + naipe.name();
		}
	}

	@Override
	public int compareTo(Carta o) {
		return this.getValor().compareTo(o.getValor());
	}
	
}
