package progresionGeometrica;
import java.util.Scanner;
public class ProgresionGeometrica {

	public static void main(String[] args) {
		//Declaramos las variables
		int limI = 0, limS = 0, r = 0, otra = 0;
		Scanner Teclado = new Scanner(System.in);
		//Solicitamos y validamos la información
		do {
			do {
				System.out.print("Introduce el valor minimo: ");
				limI = Teclado.nextInt();
				System.out.print("Introduce el valor máximo: ");
				limS = Teclado.nextInt();
				if(limI > limS || limI <= 0) System.out.println("Valores Invalidos");
			}while(limI > limS || limI <= 0);
			do {
				System.out.print("Introduce la razón: ");
				r = Teclado.nextInt();
				if (r<2) System.out.println("Razón Invalida");
				
			}while(r < 2);
			//Hacemos la progresión
			//Inicializamos pr a LimI para empezar a contar
			for(;limI <= limS; limI*=r) {
				System.out.println(limI);
			}
			//Preguntamos por otra operacion
			do {
				System.out.print("Desea hacer otra progresión? (0/1): ");
				otra = Teclado.nextInt();
				if(otra != 0 && otra != 1) System.out.println("Valor Invalido");
			}while(otra != 0 && otra != 1);
		}while(otra == 1);
		Teclado.close();
		System.out.print("FIN DE PROGRAMA");
	}

}
