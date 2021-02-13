package ordenarTresValores;
import java.util.Scanner;
public class OrdenarTresValores {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		int numA = 0, numB = 0, numC = 0;
		System.out.print("Introduce el Primer Número: ");
		numA = Entrada.nextInt();
		System.out.print("Introduce el Segundo Número: ");
		numB = Entrada.nextInt();
		System.out.print("Introduce el Tercer Número: ");
		numC = Entrada.nextInt();
		Entrada.close();
		System.out.print("Los Números Introducidos son: A:" + numA + " B:" + numB + " C:" + numC);
		if (numA < numB) {
			if (numA < numC) {
				if (numB < numC) {
					System.out.println("\n"+ numA + "," + numB + "," + numC);
				}
				else {
					System.out.println("\n"+ numA + "," + numC + "," + numB);
				}
			}
			else {
				System.out.println("\n"+ numC + "," + numA + "," + numB);
			}
		}
		else {
			if (numA < numC) {
				System.out.println("\n"+ numB + "," + numA + "," + numC);
			}
			else {
				if(numB < numC) {
					System.out.println("\n"+ numB + "," + numC + "," + numA);	
				}
				else {
					System.out.println("\n"+ numC + "," + numB + "," + numA);
				}
			}
		}
	}
}
