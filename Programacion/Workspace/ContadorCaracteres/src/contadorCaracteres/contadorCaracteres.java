package contadorCaracteres;
import java.util.InputMismatchException;
import java.util.Scanner;
public class contadorCaracteres {
	
	public static int contCaracter(int modo, String frase) {
		int contador = 0;
		char frasearray[] = frase.toCharArray();
		switch(modo) {
		case 1:
			for(int i = 0; i < frasearray.length; i++) {
				if(Character.isDigit(frasearray[i])) contador++;
			}
			break;
		case 2:
			for(int i = 0; i < frasearray.length; i++) {
				if(Character.isLetter(frasearray[i])) contador++;
			}
			break;
		case 3:
			for(int i = 0; i < frasearray.length; i++) {
				if(!Character.isLetterOrDigit(frasearray[i])) contador++;
			}
			break;
		}
		return contador;
	}
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String frase = null;
	do{
	System.out.print("Introduce una frase (Escribe FIN para salir):");
	frase = teclado.nextLine();
	if(frase.equalsIgnoreCase("fin")) break;
			System.out.println("El número de números es:" + String.valueOf(contCaracter(1,frase)));
			System.out.println("El número de carácteres es:" + String.valueOf(contCaracter(2,frase)));
			System.out.println("El número de carácteres especiales es:" + String.valueOf(contCaracter(3,frase)));
	}while(!frase.equalsIgnoreCase("fin"));
	teclado.close();
	System.out.println("Fin de Programa");
	}
}

