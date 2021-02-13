package matriz3D;
import java.util.Scanner;
public class Matriz3D {

	public static void main(String[] args) {
		//Declaramos las variables
		int ialumn = 0, iasig = 0, ieval = 0, ialmasalta = 0;
		float media = 0, masalta = 0, masbaja = 0;;
		//M = new int[6][4][3];
		Scanner Teclado = new Scanner(System.in);
		//Parte I: Insertar datos en la Matriz
		//Matriz Predefinida
		int M[][][] = { { {1,2,9},{2,6,5},{3,7,5},{4,2,5} }, 
					    { {5,9,5},{6,3,5},{7,1,5},{8,3,6} },
					    { {9,3,7},{10,4,8},{1,5,9},{2,6,6} },
					    { {10,7,6},{10,8,6},{10,9,6},{5,4,6} },
					    { {7,4,6},{8,4,6},{9,4,6},{2,4,6} },
					    { {2,5,9},{2,6,7},{3,7,7},{4,8,7} } };
		/*
		for(ieval = 0; ieval < 3; ieval++) {
			for(ialumn = 0; ialumM = new int[6][4][3];n < 6; ialumn++) {
				for(iasig = 0; iasig < 4; iasig++) {
					do {
					System.out.print("Introduce la nota del Alumno " + (ialumn + 1)
								    + " Asignatura " + (iasig+1) + " Evaluacion " 
								    + (ieval+1) + ":");
					M[ialumn][iasig][ieval] = Teclado.nextInt();
					if(M[ialumn][iasig][ieval] < 1 || M[ialumn][iasig][ieval] > 10) System.out.println("Valor Fuera de Rango");  
					}while(M[ialumn][iasig][ieval] < 1 || M[ialumn][iasig][ieval] > 10);
				}
			}
		}
		*/
		//Parte II: Mostrar datos en la Matriz
		for(ieval = 0; ieval < 3; ieval++) {
			for(ialumn = 0; ialumn < 6; ialumn++) {
				for(iasig = 0; iasig < 4; iasig++) {
					System.out.print(M[ialumn][iasig][ieval] + " ");
				}
			System.out.println("");
			}
		System.out.println("");
		}
		//Parte III Calculo Media Global
		for(ialumn = 0; ialumn < 6; ialumn++) {
			for(ieval = 0; ieval < 3; ieval++) {
				for(iasig = 0; iasig < 4; iasig++) {
					media +=  M[ialumn][iasig][ieval];
				}
			}
		}
		System.out.println("Media Global: " + (media/(6*4*3)));
		
		//Parte IV Media de cada Alumno
		for(ialumn = 0; ialumn < 6; ialumn++) {
			media = 0;
			for(iasig = 0; iasig < 4; iasig++) {
				for(ieval = 0; ieval < 3; ieval++) {
					media += M[ialumn][iasig][ieval];
				}
			}
		System.out.println("Media Alumno " + (ialumn+1) + ":" + (media/12));
		}
		
		//Parte V Media mas alta de una asignatura
		do {
			System.out.print("Introduce una Asignatura (1-4):");
			iasig = Teclado.nextInt();
			if(iasig < 1 || iasig > 4) System.out.print("Fuera de Rango\n");
		}while(iasig < 1 || iasig > 4);
	
		for(ialumn = 0; ialumn < 6; ialumn++) {
			media = 0;
			for(ieval = 0; ieval < 3; ieval++) {
				media += M[ialumn][iasig-1][ieval];
			}
		media /= 3;
		if(media >= masalta) {
			masalta = media; 
			ialmasalta = ialumn + 1; 
			}
		}
		System.out.println("Media mas alta asignatura " + (iasig) + ": " + masalta);
		System.out.println("La obtuvo el alumno: " + ialmasalta);
		
		//Parte VII Calculas Media mas baja y mal alta de asignatura y evaluacion
		do {
			System.out.print("Introduce la asignatura (1-4):");
			iasig = Teclado.nextInt();
			if(iasig < 1 || iasig > 4) System.out.print("Fuera de Rango");
		}while(iasig < 1 || iasig > 4);
		
		do {
			System.out.print("Introduce la Evaluacion (1-3):");
			ieval = Teclado.nextInt();
			if(ieval < 1 || ieval > 3) System.out.print("Fuera de Rango");
		}while(ieval < 1 || ieval > 3);
		
		masalta = 0;
		masbaja = 10;
		for(ialumn = 0; ialumn < 6; ialumn++) {
			if(M[ialumn][iasig-1][ieval-1] < masbaja) masbaja = M[ialumn][iasig-1][ieval-1];
			if(M[ialumn][iasig-1][ieval-1] > masalta) masalta = M[ialumn][iasig-1][ieval-1];
		}
		System.out.println("La nota mas baja de la asignatura " + iasig + " evaluacion " + ieval + " es:" +masbaja);
		System.out.println("La nota mas alta de la asignatura " + iasig + " evaluacion " + ieval + " es:" +masalta);
		
	}
	
}
