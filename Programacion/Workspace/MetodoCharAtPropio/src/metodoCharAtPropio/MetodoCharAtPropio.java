package metodoCharAtPropio;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MetodoCharAtPropio {
	
	static char extraerchar(String cadena, int numchar) {
		char[] chararray = cadena.toCharArray();
		return chararray[numchar];
	}
	
	public static void main(String[] args) {
		String cadena = null;
		int numchar = 0;
		boolean error = false;
		Scanner teclado = new Scanner(System.in);
		//Leemos la cadena
		System.out.print("Introduce una cadena: ");
		cadena = teclado.nextLine();
		//Leemos un indice y verificamos que sea válido
		do {
			error = false;
			try {
			System.out.print("Introduce el indice del caracter:");
			numchar = teclado.nextInt();
			System.out.println("El Caracter en la posicion " + numchar + " es: " + extraerchar(cadena,numchar - 1));
			}catch(ArrayIndexOutOfBoundsException exception) {
				error = true;
			}catch(InputMismatchException exception) {
				error = true;
				teclado.nextLine();
			}
		}while(error == true);
		teclado.close();
	}
}
