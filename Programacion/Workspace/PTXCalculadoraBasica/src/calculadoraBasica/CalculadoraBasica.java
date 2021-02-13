//Estructura Selectiva

//Solicitar dos numeros enteros y presentar un menu que le permita al usuario
//Realiar las cuatro operaciones aritmeticas basicas
//Presentar el resultado de la operacion seleccionada por el usuario para esos dos numeros
package calculadoraBasica;
import java.util.Scanner;
public class CalculadoraBasica {

	public static void main(String[] args) {
		int numA = 0,numB = 0, operacion = 0;
		Scanner Teclado = new Scanner(System.in);
		//Mostramos el Menu
		//Solicitamos los numeros y ejecutamos la operacion deseada
		System.out.print("Introduce el Primer Número: ");
		numA = Teclado.nextInt();
		System.out.print("Introduce el Segundo Numero: ");
		numB = Teclado.nextInt();
		System.out.println("----Menú Principal----");
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) Multiplicación");
		System.out.println("4) División");
		System.out.println("");
		System.out.print("Selecciona una Opción: ");
		operacion = Teclado.nextInt();
		Teclado.close();
		//Validamos si el numero introducido corresponde a alguna opcion
		switch(operacion) {
			case 1:
				System.out.println("El Resultado es :" + (numA + numB));
				break;
			case 2:
				System.out.println("El Resultado es :" + (numA - numB));
				break;
			case 3:
				System.out.println("El Resultado es :" + (numA * numB));
				break;
			case 4:
				System.out.println("El Resultado es :" + ((float)numA / numB));
				break;
			default:
				System.out.println("Operacion Invalida");
				break;

		}

	}

}
