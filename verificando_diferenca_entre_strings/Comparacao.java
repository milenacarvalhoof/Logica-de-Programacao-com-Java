package verificando_diferenca_entre_strings;

public class Comparacao {
	
	String frase1;
	String frase2;
	
	public Comparacao(String frase1, String frase2) {
		this.frase1 = frase1;
		this.frase2 = frase2;
	}
	
	public String verificarDiferenca() {
		String[] array1 = frase1.split(" ");
		String[] array2 = frase2.split(" ");
		
		String saida1 = "";
		String saida2 = "";
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i].equalsIgnoreCase(array2[i])) {
				saida1 += array1[i] + " ";
				saida2 += array2[i] + " ";
			}else {
				saida1 += "[" + array1[i] + "] ";
				saida2 += "[" + array2[i] + "] ";
			}			
		}
		
		return "Diferença:\n" + saida1 + "\n" + saida2;		
	}
	
	@Override
	public String toString() {
		return verificarDiferenca();
	}

}
