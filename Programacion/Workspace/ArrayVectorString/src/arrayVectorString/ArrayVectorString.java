package arrayVectorString;
import java.util.Scanner;
public class ArrayVectorString {

	public static void main(String[] args) {
		//char letra[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
		int numero;
		Scanner Teclado = new Scanner(System.in);
		do {
		System.out.print("Introduce el Número:");
		numero = Teclado.nextInt();
		if(String.valueOf(numero).length() != 8) System.out.print("Valor Incorrecto!\n");
		}while(String.valueOf(numero).length() != 8);
		System.out.print("NIF Completo:" + numero + (char)letra.charAt(numero%23));
	}

}
