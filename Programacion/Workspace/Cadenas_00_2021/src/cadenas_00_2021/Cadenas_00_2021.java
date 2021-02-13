package cadenas_00_2021;
import java.util.Scanner;
public class Cadenas_00_2021 {
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		//String cadena = new String("Hola");
		//String cadena = "Hola";
		//String cadena = null;
		String cadena = "", cadena1 = "";
		int numero = 0;
		System.out.print("Teclea la cadena: ");
		cadena = Teclado.nextLine();
		System.out.print("Teclea un número: ");
		numero = Teclado.nextInt();
		Teclado.nextLine();
		System.out.print("Teclea la cadena1: ");
		cadena1= Teclado.nextLine();
		System.out.println("Cadena: " + cadena);
		System.out.println("Cadena1: " + cadena1);
		System.out.println("Numero: " + numero);
		System.out.print("Longitud de la Cadena: " + cadena.length());
		Teclado.close();

	}

}
