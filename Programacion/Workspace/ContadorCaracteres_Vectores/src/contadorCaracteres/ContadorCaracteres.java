package contadorCaracteres;
import java.util.Scanner;
public class ContadorCaracteres {
	
	static void llenarCadena(String cadena) {
	//Creamos los Arrays
		char normalchar[] = new char[cadena.length()];
		char specialchar[] = new char [cadena.length()];
		int numeros[] = new int[cadena.length()];
		int inormalchar = 0 , ispecialchar = 0, inumeros  = 0;
		
		for(int i = 0; i < cadena.length(); i++) {
			if(Character.isLetter(cadena.charAt(i))) {
				normalchar[inormalchar] = cadena.charAt(i);
				inormalchar++;
			}
			else if(Character.isDigit(cadena.charAt(i))) {
				numeros[inumeros] = Character.getNumericValue(cadena.charAt(i));
				inumeros++;
			}
			else {
				specialchar[ispecialchar] = Character.valueOf(cadena.charAt(i));
				ispecialchar++;
			}
		}
		if(inormalchar > 0 ) {
		System.out.println("Caracteres Normales: ");
		for(int i = 0; i < inormalchar; i++) System.out.print(normalchar[i] + "\t");
		System.out.println();
		}
		if(ispecialchar > 0) {
		System.out.println("Caracteres Especiales: ");
		for(int i = 0; i < ispecialchar; i++) System.out.print(specialchar[i] + "\t");
		System.out.println();
		}
		if(inumeros > 0) {
		System.out.println("Numeros: ");
		for(int i = 0; i < inumeros; i++) System.out.print(numeros[i] + "\t");
		System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena = null;
		System.out.print("Introduce una cadena:");
		cadena = teclado.nextLine();
		teclado.close();
		llenarCadena(cadena);
	}
}
