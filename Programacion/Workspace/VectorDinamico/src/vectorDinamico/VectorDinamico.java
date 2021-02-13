package vectorDinamico;
import java.util.Scanner;
public class VectorDinamico {
	public static void main(String[] args) {
		int tamanovector = 0;
		Scanner Teclado = new Scanner(System.in);
		//Solicitamos el tamaño de la matriz
		do {
			System.out.print("Introduce el Tamaño del Vector (1-10): ");
			tamanovector = Teclado.nextInt();
			if(tamanovector <0 || tamanovector > 10) System.out.print("Valor fuera de rango...\n");
		}while (tamanovector < 0 || tamanovector > 10);
		//Creamos el Vector y llenamos progresivamente
		int M[] = new int [tamanovector];
		for(int i = 0; i < tamanovector; i++) {
			System.out.print("Introduce el valor para la posición " + (i+1) + ": ");
			M[i] = Teclado.nextInt();
		}
		//Mostramos la matriz
		for(int i = 0; i < tamanovector+1; i++) {
			try {
			System.out.print(M[i] + ", ");
			}catch(ArrayIndexOutOfBoundsException ae) {System.out.print("Desbordamiento");}
		}
		Teclado.close();
		System.out.print("\nFIN");
	}

}
