package serieNumerosPrimos;
import java.io.IOException;
import java.util.Scanner;
public class SerieNumerosPrimos {
	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		int limI = 0, limS = 0, subM = 0, n = 0;
		char otra = ' ';
		boolean primo = true;
		do {
			do {
				System.out.print("Introduce el límite inferior: ");
				limI = Teclado.nextInt();
				System.out.print("Introduce el límite superior: ");
				limS = Teclado.nextInt();
			}while(limI > limS);
			System.out.print("\n\n");
			if(limI == 1) limI = 2;
			for(n = limI; n <= limS; n++) {
				for(subM = 2; subM < n; subM++) {
					if(n % subM == 0) {
						primo = false;
					}
				}
				if(primo) System.out.print(n + "  ");
				else primo = true;
			}
			System.out.println("\n\n");
			do {
				try {
					System.out.print("Otra serie (s/n): ");
					otra = Character.toLowerCase((char)System.in.read());
					while(System.in.read() != '\n');
				}catch(IOException ioe) {}
			}while(otra != 'n' && otra != 's');
		}while(otra != 'n');
		System.out.print("FIN");
	}
}
