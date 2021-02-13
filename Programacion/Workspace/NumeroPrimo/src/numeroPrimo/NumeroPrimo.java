package numeroPrimo;
import java.util.Scanner;
public class NumeroPrimo {
	static void validaprimo(int num) {
		boolean primo = true;
		if(num == 1) primo = false;
		for(int i = 2; i < num/2; i++) {
			if(num % i == 0) primo = false;
		}
		if(primo == true) System.out.println( num +" es primo!");
		else System.out.println( num +" no es primo!");
	}
	
	public static void main(String[] args) {
		int num = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		validaprimo(num);
		teclado.close();

	}

}
