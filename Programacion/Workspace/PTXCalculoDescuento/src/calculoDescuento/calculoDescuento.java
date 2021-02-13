//Esctructura Selectiva Simple
//Se solicitan las unidades y el precio de un producto y se presenta el importe (unidades * precio)
//Si el importe supera el valor de 100, ademas del importe ya presentado,
//Se presenta la cantidad a descontar, que sera de un 5%
package calculoDescuento;
import java.util.Scanner;
public class calculoDescuento {
	public static void main(String[] args) {
		//Definimos las Variables
		int unidades = 0;
		float precio = 0;
		//Solicitamos la Cantidad y el Precio
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Introduce la cantidad de productos: ");
		unidades = Teclado.nextInt();
		System.out.print("Introduce el precio unitario: ");
		precio = Teclado.nextInt();
		Teclado.close();
		//Calculamos el Total
		System.out.print("TOTAL: " + precio * unidades);
		//Verificamos si Existe descuento y en caso afirmativo lo mostramos en pantalla
		if(precio * unidades > 100) {
			System.out.print("\nDESCUENTO: " + (precio * unidades * 0.05));
		}

	}

}
