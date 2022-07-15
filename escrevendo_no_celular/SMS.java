package escrevendo_no_celular;

import java.util.ArrayList;
import java.util.List;

public class SMS {
	
	String mensagem;
	String[] array;

	public SMS(String mensagem) {
		this.mensagem = mensagem;
		array = mensagem.split("");
	}
	
	public List<String> digitos() {
		
		List<String> lista = new ArrayList<>();
		
		String anterior = "";	
		
		for (String string : array) {
			if (string.equalsIgnoreCase("a") || string.equalsIgnoreCase("b") || string.equalsIgnoreCase("c")) {
				
				if (anterior.equals("2")) {
					lista.add("_");
				}else {
					anterior = "2";					
				}
				
				if (string.equalsIgnoreCase("a")) {
					lista.add("2");
				}else if (string.equalsIgnoreCase("b")) {
					lista.add("22");	
				}else{
					lista.add("222");
				}	
			}else if (string.equalsIgnoreCase("d") || string.equalsIgnoreCase("e") || string.equalsIgnoreCase("f")) {
				
				if (anterior.equals("3")) {
					lista.add("_");
				}else {
					anterior = "3";					
				}
				
				if (string.equalsIgnoreCase("d")) {
					lista.add("3");		
				}else if (string.equalsIgnoreCase("e")) {
					lista.add("33");	
				}else {
					lista.add("333");		
				}				
			}else if (string.equalsIgnoreCase("g") || string.equalsIgnoreCase("h") || string.equalsIgnoreCase("i")) {
				
				if (anterior.equals("4")) {
					lista.add("_");
				}else {
					anterior = "4";					
				}
				
				if (string.equalsIgnoreCase("g")) {
					lista.add("4");		
				}else if (string.equalsIgnoreCase("h")) {
					lista.add("44");	
				}else {
					lista.add("444");	
				}
			}else if (string.equalsIgnoreCase("j") || string.equalsIgnoreCase("k") || string.equalsIgnoreCase("l")) { 
				
				if (anterior.equals("5")) {
					lista.add("_");
				}else {
					anterior = "5";					
				}
				
				if (string.equalsIgnoreCase("j")) {
				lista.add("5");		
				}else if (string.equalsIgnoreCase("k")) {
				lista.add("55");	
				}else {
				lista.add("555");		
				}
			}else if (string.equalsIgnoreCase("m") || string.equalsIgnoreCase("n") || string.equalsIgnoreCase("o")) { 
				
				if (anterior.equals("6")) {
					lista.add("_");
				}else {
					anterior = "6";					
				}
				
				if (string.equalsIgnoreCase("m")) {
					lista.add("6");		
				}else if (string.equalsIgnoreCase("n")) {
					lista.add("66");		
				}else {
					lista.add("666");
				}
			}else if (string.equalsIgnoreCase("p") || string.equalsIgnoreCase("q") || string.equalsIgnoreCase("r") || string.equalsIgnoreCase("s")) { 
				
				if (anterior.equals("7")) {
					lista.add("_");
				}else {
					anterior = "7";					
				}
				
				if (string.equalsIgnoreCase("p")) {
					lista.add("7");	
				}else if (string.equalsIgnoreCase("q")) {
					lista.add("77");
				}else if (string.equalsIgnoreCase("r")) {
					lista.add("777");
				}else {
					lista.add("7777");	
				}
			}else if (string.equalsIgnoreCase("t") || string.equalsIgnoreCase("u") || string.equalsIgnoreCase("v")) { 
				
				if (anterior.equals("8")) {
					lista.add("_");
				}else {
					anterior = "8";					
				}
				
				if (string.equalsIgnoreCase("t")) {
					lista.add("8");	
				}else if (string.equalsIgnoreCase("u")) {
					lista.add("88");	
				}else {
					lista.add("888");	
				}
			}else if (string.equalsIgnoreCase("w") || string.equalsIgnoreCase("x") || string.equalsIgnoreCase("y") || string.equalsIgnoreCase("z")) { 
				
				if (anterior.equals("9")) {
					lista.add("_");
				}else {
					anterior = "9";					
				}
				
				if (string.equalsIgnoreCase("w")) {
					lista.add("9");	
				}else if (string.equalsIgnoreCase("x")) {
					lista.add("99");	
				}else if (string.equalsIgnoreCase("y")) {
					lista.add("999");	
				}else {
					lista.add("9999");	
				}
			}else if (string.equals(" ")) {
				lista.add("0");	
			}
		}
		
		return lista;
	}

}
