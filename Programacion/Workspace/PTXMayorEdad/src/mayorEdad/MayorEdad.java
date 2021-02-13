//Estructura Selectiva
//Determinar la mayoria de edad a partir de una edad numerica solicitada
//Tener en cuenta que los valores validos para determinarla deben estar comprendidos entre 0 y 125
package mayorEdad;
import java.util.Scanner;
public class MayorEdad {
	public static void main(String[] args) {
		int edad = 0;
		//Pedimos la edad
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Introduce la Edad: ");
		edad = Teclado.nextInt();
		Teclado.close();
		//Verificamos si la edad es valida
		if(edad > 0 && edad <= 25) {
			//Si es valida verificamos la mayoria de edad y respondemos en consecuencia
			if (edad >= 18) {
				System.out.print("Eres Mayor"); 
			}
			else {
				System.out.print("Eres Menor");
			}
		//Si la edad no es valida retornamos ERROR*
		} else System.out.print("Edad Incorrecta");
	}

}
