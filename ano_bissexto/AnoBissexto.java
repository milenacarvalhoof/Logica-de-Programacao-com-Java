package ano_bissexto;

public class AnoBissexto {
	
	private int ano;
	
	public AnoBissexto(int ano) {
		this.ano = ano;
	}
	
	public boolean anoBissexto() {
		boolean retorno = false;
		if (ano % 4 == 0) {
			if(ano % 100 != 0 || ano % 400 == 0) {
				retorno = true;
			}	
		}
		return retorno;
	}

	@Override
	public String toString() {
		if (anoBissexto()) {
			return "Ano Bissexto";			
		}else {
			return "Ano Não Bissexto";
		}
	}
}
