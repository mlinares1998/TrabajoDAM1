//Estructura Selectiva
//Determinar el tipo de triángulo a partir de la lingitud de sus ladosç
//La longitud de los mismos se solicita por teclado
package calculoTriangulos;
import java.util.Scanner;
public class CalculoTriangulos {

	public static void main(String[] args) {
		int ladoA = 0, ladoB = 0, ladoC = 0;
		Scanner Teclado = new Scanner(System.in);
		//Solicitamos al usuario que introduzca las medidas de cada lado
		System.out.print("Introduce el Lado A: ");
		ladoA = Teclado.nextInt();
		System.out.print("Introduce el Lado B: ");
		ladoB = Teclado.nextInt();
		System.out.print("Introduce el Lado C: ");
		ladoC = Teclado.nextInt();
		Teclado.close();
		
		//Verificamos que Los lados del triángulo sean positivos
		//Y que las medidas correspondan a un triangulo lógico
		
		if(ladoA + ladoB <= ladoC || ladoA+ ladoC <= ladoB || ladoB + ladoC <= ladoA) {
			System.out.print("Triangulo Inválido");
		}
		else {
			if(ladoA == ladoB) {
				if(ladoB == ladoC) {
					System.out.print("Triangulo Equilatero");
				}
				else {
					System.out.print("Triangulo Isósceles");
				}
			}
			else {
				if (ladoB == ladoC || ladoA == ladoC) {
					System.out.print("Triangulo Isósceles");
				}
				else {
					System.out.print("Triangulo Escaleno");
				}
			}	
		}	
	}
}
