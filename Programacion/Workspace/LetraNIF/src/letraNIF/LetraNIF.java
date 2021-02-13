package letraNIF;
import java.util.Scanner;
public class LetraNIF {
		static String letraNIF(int numNIF) {
			String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
			return (String.valueOf(numNIF) + String.valueOf(letra.charAt(numNIF%23)));
		}
		public static void main(String[] args) {
			int numNIF;
			Scanner Teclado = new Scanner(System.in);
			do {
				System.out.print("Introduce el numero de NIF: ");
				numNIF = Teclado.nextInt();
				if(String.valueOf(numNIF).length() != 8) System.out.print("Error:Valor Invalido!\n");
			}while(String.valueOf(numNIF).length() != 8);
			
			Teclado.close();
			System.out.println("El NIF Completo es: " + letraNIF(numNIF));
		}

	}
