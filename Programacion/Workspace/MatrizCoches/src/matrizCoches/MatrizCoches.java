package matrizCoches;
import java.util.Scanner;
public class MatrizCoches {

	public static void main(String[] args) {
		int M[][] = {{25,46,32,11},{3,8,11,12},{45,65,23,22},{125,345,200,100},{40,34,7,54},
					{12,56,98,4},{9,5,123,44},{27,83,160,3},{23,44,66,13},{4,5,70,9},{12,23,34,2},{33,87,200,3}};
		int mes = 0, marca = 0, suma = 0;
		Scanner Teclado = new Scanner(System.in);
		/*
		M = new int[12][4];
		for(mes = 0; mes < 12; mes++) {
			for(marca = 0; marca < 4; marca++) {
				System.out.print("Ventas en el mes " + (mes+1) + " del coche " + (marca + 1) +":");
				M[mes][marca] = Teclado.nextInt();
			}
		}
		*/
		//PARTE I: Mostrar Matriz Ventas y Ventas Totales
		System.out.print("\n");
		for(mes = 0; mes < 12; mes++) {
			for(marca = 0; marca < 4; marca++) {
				System.out.print(M[mes][marca] + " ");
				suma += M[mes][marca];
			}
			System.out.print("\n");
		}
		System.out.print("\nTotal Ventas: " + suma);
		
		//PARTE II: Marca mas Vendida y Mes con mas Ventas
		//Coche mas vendido
		int cocheMax = 0, ventaMax = 0;
		for(marca = 0; marca < 4; marca++) {
			suma = 0;
			for(mes = 0; mes < 12; mes++) {
				suma += M[mes][marca];
			}
			if(ventaMax < suma) {
				ventaMax = suma;
				cocheMax = marca;
			}
		}
		System.out.print("\nEl coche mas vendido es " + (cocheMax) + " con un total de " + ventaMax + " unidades." );
		//Mes con mayor numnero de ventas
		int mesMax = 0;
		ventaMax = 0;
		for(mes = 0; mes < 12; mes++) {
			suma = 0;
			for(marca = 0; marca < 4; marca++) {
				suma += M[mes][marca];
			}
			if(ventaMax < suma) {
				ventaMax = suma;
				mesMax = mes;
			}
		}
		System.out.print("\nEl mes con mas ventas fue " + (mesMax + 1) + " con un total de " + ventaMax + " unidades.");
		//Parte III: Coche mas vendido en un mes
	
		int marcaMax = 0;
		mesMax = 0;
		ventaMax = 0;
		for(mes = 0; mes < 12; mes++) {
			for(marca = 0; marca < 4; marca++) {
				if(M[mes][marca] > ventaMax) {
					ventaMax = M[mes][marca];
					mesMax = mes;
					marcaMax = marca;
				}
			}
		}
		System.out.print("\nEl mes con mayores ventas fue el mes " + (mesMax + 1) + " la marca mas vendida fue " + marcaMax + "con un total de " + ventaMax + " unidades." );
		
		//Parte IV: Ventas totales del mes
		ventaMax = 0;
		do {
		System.out.print("\nIntroduce un mes para conocer sus ventas (1-12): ");
		mes = Teclado.nextInt() - 1;
		}while(mes < 0 || mes > 11);
		
		for(marca = 0; marca < 4; marca ++) {
			ventaMax += M[mes][marca];
		}
		System.out.print("Las ventas totales del mes " + (mes+1) + " fueron de " + ventaMax + " unidades.");
		do {
		System.out.print("\nIntroduce un mes (1-12):");
		mes = Teclado.nextInt() - 1;
		System.out.print("Introduce una marca (1-4):");
		marca = Teclado.nextInt() - 1;
		}while(mes < 0 || mes > 11 || marca < 0 || marca > 3);
		Teclado.close();
		
		System.out.print("Las ventas del coche " + (marca+1) + " en el mes " + (mes+1) + "fueron de " + M[mes][marca] + " unidades");
	}
	
}
