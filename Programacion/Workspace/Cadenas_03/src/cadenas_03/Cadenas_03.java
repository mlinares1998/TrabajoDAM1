package cadenas_03;
public class Cadenas_03 {
	public static void main(String[] args){
		String cadena="Estamos en clase de programación";
		int i=0;
		System.out.print("La frase a analizar es: "+cadena);
		System.out.println("\nCon la función \"charAt\" se accede a un caracter por su posición.\n");
		for(i=0;i<cadena.length();i++){
			if (cadena.charAt(i)==' ')
				System.out.println("Caracter en blanco -> "+i);
			else
				System.out.println("Caracter: "+cadena.charAt(i)+" en posición -> "+i);
		}
	}
}
