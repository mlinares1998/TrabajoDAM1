//Estructura Selectiva
//Calcular una edad a partir de un día,mes, o año solicitados
//Suponemos que los valores introducidos son correctos
//Y la edad se calcula sobre el dia de hoy
package calculoEdad;
import java.util.Scanner;
public class CalculoEdad {
	public static void main(String[] args) {
		//Declaramos las variables y obtenemos los valores
		int diaNac = 0, mesNac = 0, anoNac = 0, diaAct = 0, mesAct = 0, anoAct = 0;
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Introduce el Día Actual: ");
		diaAct = Teclado.nextInt();
		System.out.print("Introduce el Mes Actual: ");
		mesAct = Teclado.nextInt();
		System.out.print("Introduce el Año Actual: ");
		anoAct = Teclado.nextInt();
		System.out.print("Introduce el Día de Nacimiento: ");
		diaNac = Teclado.nextInt();
		System.out.print("Introduce el Mes de Nacimiento: ");
		mesNac = Teclado.nextInt();
		System.out.print("Introduce el Año de Nacimiento: ");
		anoNac = Teclado.nextInt();
		Teclado.close();
		//Calculamos la edad actual tomando en cuenta el mes y el dia
		//Si el dia de nacimiento es mayor que el dia actual
		if(diaAct - diaNac < 0) {
			mesAct -= 1;
		}
		//Si el mes de nacimiento es mayor que el mes actual
		if(mesAct - mesNac < 0) {
			anoAct -=1;
		}
		//Generamos la salida
		System.out.print("Tu edad actual es: " + (anoAct - anoNac) + " años");
	}

}
