package metodos_01;
import java.util.Scanner;
public class Metodos_01 {

	static int suma(Scanner ent) {
		int n1=0, n2=70;
		System.out.print("N1: ");
		n1= ent.nextInt();
		System.out.print("N2: ");
		n2 = ent.nextInt();
		return (n1+n2);
	}
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		int suma = suma(Teclado);
		System.out.println(suma);
		Teclado.close();
	}

}
