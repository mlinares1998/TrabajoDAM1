package validadorLetraNIFCompleto;
import java.util.Scanner;
public class ValidadorLetraNIFCompleto {
	
	static String letraNIF(int numNIF) {
		String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
		return (String.valueOf(numNIF) + String.valueOf(letra.charAt(numNIF%23)));
	}
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		String inNIF = null, outNIF = null;
		char letraNIF = ' ';
		boolean valido = true;
		int numNIF = 0;
		//Solicitamos el NIF, validamos longitud y letra al final
		do {
			valido = true;
			try {
				System.out.print("Introduce el NIF con Letra: ");
				inNIF = Teclado.nextLine();
				//Leemos los datos y los validamos.
				numNIF =  Integer.parseInt(inNIF.substring(0,8));
				letraNIF = Character.toUpperCase(inNIF.charAt(8));
				inNIF = String.valueOf(numNIF) + letraNIF;
			//Casos en los que el NIF es Invalido
			}catch(NumberFormatException |StringIndexOutOfBoundsException e) {valido = false;}
			if(inNIF.length() != 9) valido = false;
			if(!Character.isLetter(letraNIF)) valido = false;
			if(numNIF <= 0) valido = false;
			if(!valido) System.out.println("ERROR: Valor Inválido!");
		}while(!valido);
		//Determinamos la letra y verificamos si coinciden ambas cadenas
		Teclado.close();
		outNIF = letraNIF(numNIF);
		if(inNIF.equals(outNIF)) System.out.println("NIF VALIDO!");
		else System.out.println("NIF INVÁLIDO!");
	}
}
