package metodoCharAt;
public class MetodoCharAt {
	public static void main(String[] args) {
		String frase0 = "Mañana es Jueves", frase1 = "";
		int pos = 0;
		char letra = ' ';
		for(pos = 0; pos < frase0.length(); pos++) {
			letra = Character.toLowerCase(frase0.charAt(pos));
			switch(letra) {
			case 'a', 'b', 'c', 'd', 'e': frase1 += letra;
			}
		}
		System.out.print("Frase 1: " + frase1);

	}

}
