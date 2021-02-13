//Estructura Secuencial
//Se solicita un número y se presenta el resultado del mismo elevado a la 3
//Calcula la potencia a 3 de un número
package potenciaCubo;
import java.util.Scanner;
public class PotenciaCubo {

	public static void main(String[] args) {
		//Declaramos la variable Base y de entrada
		int Base = 0;
		Scanner Teclado = new Scanner(System.in);
		//Solicitamos el Numero
		System.out.print("Introduce un Número: ");
		Base = Teclado.nextInt();
		Teclado.close();
		//Usamos Math.pow Para calcular el valor y retornamos
		System.out.print("El resultado es: " + (int)Math.pow(Base,3));

	}

}
