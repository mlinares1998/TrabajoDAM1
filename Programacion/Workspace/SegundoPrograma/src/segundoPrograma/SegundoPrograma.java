package segundoPrograma;
import java.util.Scanner;
public class SegundoPrograma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		System.out.print("Teclee Número?: ");
		num = entrada.nextInt();
		System.out.print("El número tecleado es: " + num);
		entrada.close();
	}

}
