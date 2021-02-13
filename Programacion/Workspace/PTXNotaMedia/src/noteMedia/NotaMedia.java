//Estructura Selectiva Simple
//Se solicitan dos notas y se presenta la nota media
//Si la nota media es inferior a 5  se presenta un texto que indique que debe recuperar
package noteMedia;
import java.util.Scanner;
public class NotaMedia {
	public static void main(String[] args) {
		//Inicializamos Variables
		int Nota1 = 0, Nota2 = 0, Media = 0;
		Scanner Teclado = new Scanner(System.in);
		//Preguntamos por las notas
		System.out.print("Introduzca la Primera Nota: ");
		Nota1 = Teclado.nextInt();
		System.out.print("Introduzca la Segunda Nota: ");
		Nota2 = Teclado.nextInt();
		//Calculamos y mostramos la media
		Media = (Nota1+Nota2)/2;
		System.out.print("La Nota Media es: " + Media);
		//Indicamos si debe recuperar
		if(Media < 5) {
			System.out.print("\nDebe Recuperar");
		Teclado.close();
		}
		
		
	}

}
