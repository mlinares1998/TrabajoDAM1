package matrizSinRepOrd;
import java.util.Scanner;
public class MatrizSinRepOrd {
	public static void main(String[] args) {
		//Declaramos las Variables
		int M[] = new int [10], i1 = 0, i2 = 0, num = 0, aux = 0;
		boolean duplicado = false;
		Scanner Teclado = new Scanner(System.in);
		//Llenamos la matriz
		for(i1 = 0; i1 < 10; i1++) {
			do {
				duplicado = false;
				System.out.print("Introduce el valor " + i1 + ":" );
				num = Teclado.nextInt();
				for(i2 = 0; i2 < 10; i2++) {
					if(num == M[i2]) duplicado = true;
				}
				if(!duplicado) M[i1] = num;
			}while(duplicado);
		}
		//Mostramos la matriz desordenada
		System.out.println("Matriz Desordenada");
		for(i1 =0; i1 <10;i1++) System.out.print(M[i1] + " ");
		System.out.println("");
		//Ordenamos la matriz
		for(i1 = 0;i1<10;i1++) {
			for(i2  = i1+1;i2<10;i2++) {
				if(M[i1] > M[i2]) {
					aux = M[i2];
					M[i2] = M[i1];
					M[i1] = aux;
				}
			}
		}
		System.out.println("Matriz Ordenada");
		for(i1 = 0; i1 < 10; i1++) System.out.print(M[i1]+" ");
		System.out.print("\nFIN DE PROGRAMA");
	}

}
