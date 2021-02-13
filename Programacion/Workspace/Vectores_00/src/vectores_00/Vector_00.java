package vectores_00;
import java.util.Scanner;

public class Vector_00 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int i = 0;
		//Definicion en varias partes
		//int v[];
		//v = new int[7];
	    //Defincion en una linea
		int v[] = new int[7];
		while(i<7) {
			System.out.print("Teclee valor? ");
			v[i] = e.nextInt();
			i++;
		}
		System.out.print("\n"); 
		while(i>0) {
			i--;
			System.out.print(v[i]+"\t");
		}
	}
}
