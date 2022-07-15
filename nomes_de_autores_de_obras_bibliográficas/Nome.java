package nomes_de_autores_de_obras_bibliográficas;

public class Nome {
	
	private String nomeCompleto;
	private String sobrenome;
	private String nome = "";

	public Nome(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto.toLowerCase();	
		gerarNomeESobrenome();
	}	
	
	public boolean nomeEspecial() {
		boolean filho = sobrenome.equals("filho") || sobrenome.equals("filha");
		boolean neto = sobrenome.equals("neto") || sobrenome.equals("neta");
		boolean sobrinho = sobrenome.equals("sobrinho") || sobrenome.equals("sobrinha");
		boolean junior = sobrenome.equals("junior");
		
		if (filho || neto || sobrinho || junior) {
			return true;
		}else {
			return false;
		}
	}
	
	public void gerarNomeESobrenome() {
		String[] array = nomeCompleto.split(" ");
		
		sobrenome = array[array.length - 1];
		
		int qtdNomes = array.length - 1;
		
		if (nomeEspecial() && array.length > 2) {
			sobrenome = array[array.length - 2] + " " + array[array.length - 1];
			qtdNomes = array.length - 2;			
		}
		for (int i = 0; i < qtdNomes; i++) {
			if (array[i].equalsIgnoreCase("de")) {
				nome += array[i] + " ";				
			}else {
				nome += array[i].substring(0, 1).toUpperCase() + array[i].substring(1) + " ";
			}
		}
	}

	@Override
	public String toString() {
		return sobrenome.toUpperCase() + ", " + nome;
	}
}
