package validadorLetraNIF;
import java.util.Scanner;
public class ValidadorLetraNIF {

	static String letraNIF(int numNIF) {
		String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
		return (String.valueOf(numNIF) + String.valueOf(letra.charAt(numNIF%23)));
	}
	public static void main(String[] args) {
		int numNIF;
		char letraNIF;
		String nifCompleto, nifCalculado;
		Scanner Teclado = new Scanner(System.in);
		do {
			System.out.print("Introduce el numero de NIF: ");
			numNIF = Teclado.nextInt();
			if(String.valueOf(numNIF).length() != 8) System.out.print("Error:Valor Invalido!\n");
			System.out.print("Introduce la Letra del NIF: ");
			letraNIF = java.lang.Character.toUpperCase(Teclado.next().charAt(0));
			if(!java.lang.Character.isLetter(letraNIF)) System.out.println("Error: Letra Inválida\n");
		}while(String.valueOf(numNIF).length() != 8 && !java.lang.Character.isLetter(letraNIF));
		Teclado.close();
		nifCompleto = String.valueOf(numNIF) + String.valueOf(letraNIF);
		nifCalculado = letraNIF(numNIF);
		if(nifCompleto.equals(nifCalculado) ) System.out.println("NIF VALIDO!");
		else System.out.println("NIF INVALIDO!");
	}
}