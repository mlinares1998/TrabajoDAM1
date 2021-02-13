//Estructura Selectiva Doble
//Se solicitan unidades y el precio de un producto y se presenta
//el importe (Unidades * Precio) donde aparecera aplicado un descuento
//del 5% se el importe es inferior a 100, y del 10% sino se cumple esta condicion
package calculoImporte;
import java.util.Scanner;
public class CalculoImporte {
	
	public static void main(String[] args) {
		//Declaramos las Variables
		int unidades = 0; 
		float precio = 0, total = 0;
		Scanner Teclado = new Scanner(System.in);
		//Solicitamos los datos pertinentes
		System.out.print("Introduce las unidades: ");
		unidades = Teclado.nextInt();
		System.out.print("Introduce el Precio: ");
		precio = Teclado.nextInt();
		Teclado.close();
		//Calculamos el Total
		total = unidades * precio;
		//Verificamos si el Total es mayor que 100 para aplicar el descuento correspondiente
		if(total < 100) {
			System.out.print("TOTAL: " + (total - (total *0.05)));
		}
		else {
			System.out.print("TOTAL: " + (total - (total *0.1)));
		}
	}

}
