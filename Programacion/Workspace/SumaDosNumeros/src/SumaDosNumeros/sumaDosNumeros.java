package SumaDosNumeros;
import java.util.Scanner;
public class sumaDosNumeros {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int num1 = 0, num2 = 0, suma = 0;
		System.out.print("Teclee primer valor?");
		num1 = ent.nextInt();
		System.out.print("Teclee segundo valor?");
		num2 = ent.nextInt();
		ent.close();
		suma = num1 + num2;
		System.out.println("\n" + "La suma es:" + suma);
		
	}
}