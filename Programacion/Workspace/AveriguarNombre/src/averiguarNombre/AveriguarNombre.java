package averiguarNombre;
import java.util.Scanner;
public class AveriguarNombre {
	public static void main(String[] args) {
		String nombre = null;
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Introduce el Nombre: ");
		nombre = Teclado.nextLine();
		if(nombre.equalsIgnoreCase("Samuel")) {
			System.out.print("Acierto");	
		}else {
			System.out.print("Fallo");
		}
	}

}
