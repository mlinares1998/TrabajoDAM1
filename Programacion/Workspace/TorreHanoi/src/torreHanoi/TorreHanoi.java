package torreHanoi;
import java.util.Scanner;
public class TorreHanoi {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		int numA = 0, numB = 0, numC = 0, aux = 0;
		System.out.print("Introduce el Primer Número: ");
		numA = Entrada.nextInt();
		System.out.print("Introduce el Segundo Número: ");
		numB = Entrada.nextInt();
		System.out.print("Introduce el Tercer Número: ");
		numC = Entrada.nextInt();
		Entrada.close();
		System.out.print("Los Números Introducidos son: A:" + numA + " B:" + numB + " C:" + numC);
		if(numA > numB) {
			aux = numA;
			numA = numB;
			numB = aux;
		}
		if(numA > numC) {
			aux = numA;
			numA = numC;
			numC = aux;
		}
		if(numB > numC) {
			aux = numB;
			numB = numC;
			numB = aux;
		}
		System.out.print(numA + " < " + numB + " < "+ numC );
	}
}
