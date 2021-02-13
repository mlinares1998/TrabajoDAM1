package palindromo;
import java.util.Scanner;
public class Palindromo {
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		boolean Palindromo = true;
	    String Frase, FraseSinEsp = "";
	    //Leemos la frase
	    System.out.print("Introduce la Frase: ");
	    Frase = Teclado.nextLine();
	    Teclado.close();
	    //Eliminamos los espacios
	    for(int i = 0; i < Frase.length(); i++) {
	    	if(Frase.charAt(i) != ' ') FraseSinEsp += Character.toLowerCase(Frase.charAt(i));
	    }
	    //Verificamos si es Palindromo
	    for(int i = 0; i < FraseSinEsp.length(); i ++) {
	    	if(FraseSinEsp.charAt(i) != FraseSinEsp.charAt(FraseSinEsp.length() - (i+1))) {
	    		Palindromo = false;
	    		break;
	    	}
	    }
	    //Salida
	    if(Palindromo) System.out.print("Es un Palindromo!");
	    else System.out.print("No es un Palindromo");
		
	}
}
