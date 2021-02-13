//Estructura Selectiva Multiple
//Determinar la calificacion obtenida a partir de una nota solicitada
//1,2 Muy Deficiente
//3,4 Insuficiente
//5 Suficiente
//6 Ben
//7,8 Notable
//9,10 Sobresaliente
//Otros valores mostrarán nota incorrecta

package verificaNota;
import java.util.Scanner;
public class VerificaNota {
	public static void main(String[] args) {
		int nota = 0;
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Introduzca la nota: ");
		nota = Teclado.nextInt();
		switch(nota) {
			case 1,2:
				System.out.print("Muy Deficiente");
				break;
			case 3,4:
				System.out.print("Insuficiente");
				break;
			case 5:
				System.out.print("Suficiente");
				break;
			case 6:
				System.out.print("Bien");
				break;
			case 7,8:
				System.out.print("Notable");
				break;
			case 9,10:
				System.out.print("Sobresaliente");
				break;
			default:
				System.out.print("Nota Incorrecta");
				break;
		}
		Teclado.close();

	}

}