package entradas_no_banco;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Registro {
	
	private LocalDateTime data;
	private boolean aberturaDaPorta;

	public Registro(LocalDateTime data) {
		this.data = data;
		if (data.getHour() >= 10 && data.getHour() < 16) {
			aberturaDaPorta = true;
		}
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isAberturaDaPorta() {
		return this.aberturaDaPorta;
	}

	public void setAberturaDaPorta(boolean aberturaDaPorta) {
		this.aberturaDaPorta = aberturaDaPorta;
	}

	@Override
	public String toString() {
		return "[" + data.format(DateTimeFormatter.ISO_LOCAL_DATE) + " " + data.format(DateTimeFormatter.ISO_LOCAL_TIME) + "] - Abertura da Porta " + (aberturaDaPorta ? "Ok" : "Negado");
	}
	
	

}
