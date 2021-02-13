package sumaArray;
import java.util.Scanner;
public class SumaArray {
	public static void main(String[] args) {
		int Importe[] = new int[12], i = 0, suma = 0;
		Scanner Teclado = new Scanner(System.in);
		for(i=0;i<12;i++) {
			System.out.print("Escribe el valor " + (i+1) + ": ");
			Importe[i] =  Teclado.nextInt();
		}
		for(i=0;i<12;i++) suma = suma + Importe[i];
		System.out.print("Total: " + suma);
		Teclado.close();
	}

}
