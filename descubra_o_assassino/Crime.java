package descubra_o_assassino;

public class Crime {
	
	private String assassino;
	private String armaDoCrime;
	private String localDoCrime;
	
	private Armas armas = new Armas();
	private Locais locais = new Locais();
	private Suspeitos suspeitos = new Suspeitos();
	
	boolean assassinoCerto = false;
	boolean localCerto = false;
	boolean armaCerta = false;
	
	public Crime() {
		armaDoCrime = armas.gerarArmaDoCrime();
		localDoCrime = locais.gerarLocalDoCrime();
		assassino = suspeitos.gerarAssassino();
	}	

	public String getAssassino() {
		return assassino;
	}

	public void setAssassino(String assassino) {
		this.assassino = assassino;
	}

	public String getArmaDoCrime() {
		return armaDoCrime;
	}

	public void setArmaDoCrime(String armaDoCrime) {
		this.armaDoCrime = armaDoCrime;
	}

	public String getLocalDoCrime() {
		return localDoCrime;
	}

	public void setLocalDoCrime(String localDoCrime) {
		this.localDoCrime = localDoCrime;
	}

	public Armas getArmas() {
		return armas;
	}

	public void setArmas(Armas armas) {
		this.armas = armas;
	}

	public Locais getLocais() {
		return locais;
	}

	public void setLocais(Locais locais) {
		this.locais = locais;
	}

	public Suspeitos getSuspeitos() {
		return suspeitos;
	}

	public void setSuspeitos(Suspeitos suspeitos) {
		this.suspeitos = suspeitos;
	}
	
	public boolean teoriaCerta() {
		if (armaCerta && localCerto && assassinoCerto) {
			return true;
		}
		return false;
	}
	
	public String teoria(int numAssassino, int numLocal, int numArma) {
		
		String palpiteAssassino = suspeitos.getSuspeitos().get(numAssassino - 1);
		String palpiteLocal = locais.getLocais().get(numLocal - 1);
		String palpiteArma = armas.getArmas().get(numArma - 1);
		
		if (palpiteAssassino.equalsIgnoreCase(this.assassino)) {
			assassinoCerto = true;
		}
		
		if (palpiteLocal.equalsIgnoreCase(this.localDoCrime)) {
			localCerto = true;
		}
		
		if (palpiteArma.equalsIgnoreCase(this.armaDoCrime)) {
			armaCerta = true;
		}
		
		if (armaCerta && localCerto && assassinoCerto) {
			return "Retorno: 0 (Todos corretos, você solucionou o caso)!";
		} else if (armaCerta && localCerto) {
			return "Retorno: 1 (somente o assassino está incorreto)!";
		} else if (armaCerta && assassinoCerto) {
			return "Retorno: 2 (somente o local está incorreto)!";
		} else if (assassinoCerto && localCerto) {
			return "Retorno: 3 (somente a arma está incorreta)!";
		} else if (assassinoCerto) {
			return "Retorno: 2, ou 3 (somente o assassino está correto)!";
		} else if (localCerto) {
			return "Retorno: 1, ou 3 (somente o local está correto)!";
		} else if (armaCerta) {
			return "Retorno: 1, ou 2 (somente a arma está correta)!";
		} else {
			return "Retorno: 1, ou 2, ou 3 (todos estão incorretos)!";
		}
		
	}
	
}
