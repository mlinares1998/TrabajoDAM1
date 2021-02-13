package stringToArray;
import java.util.Scanner;
public class StringToArray {
	public static void main(String[] args) {
		String Frase= "";
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Introduce la frase:");
		Frase = Teclado.nextLine();
		Teclado.close();
		//Convertimos a Array
		char Array[] = new char[Frase.length()];
		for(int i = 0; i < Array.length; i++) {
			Array[i] = Frase.charAt(i);
		}
		//Retornamos el Array En Reversa
		for(int i = Array.length -1; i >= 0; i--) {
			System.out.print(Array[i]);
		}
	}

}
// Se puede hacer con .toCharArray() y String.ValueOf(Vector)