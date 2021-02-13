package matrizBidimensional_00;
import java.util.Scanner;
public class MatrizBidimensional_00 {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		//int M[][] = new int[4][6], 
		int M[][] = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}}, i1 = 0, i2 = 0;
		/*for(i1 = 0; i1 < 4; i1++) {
			for(i2 = 0; i2 < 6; i2++) {
				System.out.print("Teclee Elemento M["+ i1 + "][" + i2 + "]: ");
				M[i1][i2] = Teclado.nextInt();
			}
		}
		*/
		Teclado.close();
		for(i1 = 0; i1 < 4; i1++) {
			for(i2 = 0; i2 < 6; i2++) {
				System.out.print(M[i1][i2]+ "\t");
			}
			System.out.print("\n");
		}

	}

}
