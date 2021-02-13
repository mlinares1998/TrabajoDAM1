package acumuladores;
import java.util.Scanner;
public class Acumuladores {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int variable1 = 0, variable2 = 0;
		do {
			System.out.print("Valor? ");
			variable1 = ent.nextInt();
			variable2 += variable1;
		}while(variable2 <100);
	}
}
