package contadorVocales;
import java.io.IOException;
public class ContadorVocales {
	public static void main(String[] args) {
		char vectorchar[] = new char[10];
		int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
		//Introducimos los caracteres secuencialmente
		for(int i = 0; i<10; i++) {
			try {
				System.out.print("Introduce el caracter en la posición " + (i+1) + ":");
				vectorchar[i] = Character.toLowerCase((char)System.in.read());
				while(System.in.read() != '\n');
			}catch(IOException ioe) {System.out.print("ERROR: Valor Invalido");}
			switch(vectorchar[i]) {
			case 'a': contA++; break;
			case 'e': contE++; break;
			case 'i': contI++; break;
			case 'o': contO++; break;
			case 'u': contU++; break;
			}
		}
		System.out.print("\nA: " + contA);
		System.out.print("\nE: " + contE);
		System.out.print("\nI: " + contI);
		System.out.print("\nO: " + contO);
		System.out.print("\nU: " + contU);
		System.out.print("\nFIN");
 	}
}
