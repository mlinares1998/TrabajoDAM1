//Estructura Selectiva Multiple
//Presentar el nombre de la provincia a partir de un codigo solicitado
//15 A Coruña
//27 Lugo
//32 Pontevedra
//36 Ourense
//Otros valores mostraran código incorrecto
package codigoProvincia;
import java.util.Scanner;
public class CodigoProvincia {
	public static void main(String[] args) {
		int codigo = 0;
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Introduzca el coedigo de provincia: ");
		codigo = Teclado.nextInt();
		switch(codigo) {
			case 15:
				System.out.print("A Coruña");
				break;
			case 27:
				System.out.print("Lugo");
				break;
			case 32:
				System.out.print("Ourense");
				break;
			case 36:
				System.out.print("Pontevedra");
				break;
			default:
				System.out.print("Ti estas fora do Galiza neno");
				break;
		}
		Teclado.close();

	}

}
