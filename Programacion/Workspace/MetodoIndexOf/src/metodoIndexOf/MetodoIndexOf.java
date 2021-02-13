package metodoIndexOf;
public class MetodoIndexOf {
	public static void main(String[] args) {
		char letra = 'e';
		String subcad = "fr";
		String cadena = "Esto es una frase de ejemplo que dará fruto";
		System.out.println("Resultado Index 1 => " + cadena.indexOf(letra));
		System.out.println("Resultado Index 2 => " + cadena.indexOf(letra,8));
		System.out.println("Resultado Index 3 => " + cadena.indexOf(subcad));
		System.out.println("Resultado Index 4 => " + cadena.indexOf(subcad,20));
	}
}
