package metodoBurbuja;
import java.util.Scanner;
public class MetodoBurbuja {
	public static void main(String[] args) {
		int tabla[] = {100,23,2,45,78,66,61,55,27,30};
		int aux = 0, i1 = 0, i2 = 0;
		Scanner Teclado = new Scanner(System.in);
		/*for(i1 = 0; i1<10;i1++) {
			System.out.print("Introduce el valor " + i1 + ":");
			tabla[i1] = Teclado.nextInt();		
			}
		*/
		for(i1 = 0; i1 <10; i1++) {
			System.out.print(tabla[i1] + "  ");
		}
		System.out.print("\n");
		for(i2 = 0; i2 < tabla.length -1; i2++) {
			for(i1 = i2; i1 < tabla.length; i1++) {
				if(tabla[i1] < tabla[i2]) {
					aux = tabla[i2];
					tabla[i2] = tabla[i1];
					tabla[i1] = aux;
				}
			}
		}
		for(i1 = 0; i1 <10; i1++) {
			System.out.print(tabla[i1] + "  ");
		}

	}

}
