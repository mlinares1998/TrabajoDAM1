package sentenciaForVector;
import java.util.Scanner;
public class SentenciaForVector {
	public static void main(String[] args) {
		//Declaramos las variables
		int Vector[] = new int [10], i = 0;
		//Creamos un Scanner
		Scanner Teclado = new Scanner(System.in);
		//Solicitamos los datos de entrada con un For y guardamos sucesivamente en el vector
		while(i<10) {
			System.out.print("Introduce el valor en la posicion " + (i+1) + ":");
			Vector[i] = Teclado.nextInt();
			i++;
		}
		Teclado.close();
		while(i>0) {System.out.println(Vector[--i]);}
		//SI uso ; I estoy indicando que use el valor de I
		/*
		for(i=0; i <10; i++) {
			System.out.print("Introduce el valor en la posicion " + (i+1) + ":");
			Vector[i] = Teclado.nextInt();
		}
		//Cerramos el Teclado y Recorremos el vector a la inversa
		Teclado.close();
		for(;i>=0;i--) {
			System.out.println(Vector[i]);
		}
		*/
	}
}