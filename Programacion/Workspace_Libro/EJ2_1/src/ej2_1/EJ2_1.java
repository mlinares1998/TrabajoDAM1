//Calculo Letra DNI
package ej2_1;
import java.util.Scanner;
public class EJ2_1 {
	public static void main(String[] args) {
		int nDNI;
		char letraDNI = ' ';
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Introduce el número de DNI: ");
		nDNI = Teclado.nextInt();
		//Calculo Letra DNI
		switch(nDNI % 23) {
		case 0:
			letraDNI = 'T';
			break;
		case 1:
			letraDNI = 'R';
			break;
		case 2:
			letraDNI = 'W';
			break;
		case 3:
			letraDNI = 'A';
			break;
		case 4:
			letraDNI = 'G';
			break;
		case 5:
			letraDNI = 'M';
			break;
		case 6:
			letraDNI = 'Y';
			break;
		case 7:
			letraDNI = 'F';
			break;
		case 8:
			letraDNI = 'P';
			break;
		case 9:
			letraDNI = 'D';
			break;
		case 10:
			letraDNI = 'X';
			break;
		case 11:
			letraDNI = 'B';
			break;
		case 12:
			letraDNI = 'N';
			break;
		case 13:
			letraDNI = 'J';
			break;
		case 14:
			letraDNI = 'Z';
			break;
		case 15:
			letraDNI = 'S';
			break;
		case 16:
			letraDNI = 'Q';
			break;
		case 17:
			letraDNI = 'V';
			break;
		case 18:
			letraDNI = 'H';
			break;
		case 19:
			letraDNI = 'L';
			break;
		case 20:
			letraDNI = 'C';
			break;
		case 21:
			letraDNI = 'K';
			break;
		case 22:
			letraDNI = 'E';
			break;
		}
		System.out.print("El DNI Final es: " + nDNI + (char)letraDNI);
		Teclado.close();

	}

}
