package matrizDiagonales;

public class MatrizDiagonales {

	public static void main(String[] args) {
		int M[][] = {{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},
				{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9}};
		int i1 = 0, i2 = 0;
		//Mostramos la Matriz definida
		for(i1 = 0; i1 < 8; i1++) {
			for(i2 = 0; i2 < 8; i2++) {
				System.out.print(M[i1][i2] + " ");
			}
		System.out.print("\n");
		}
		//LLenamos la Matriz 
		for(i1 = 0; i1 < 8; i1++) {
			for(i2 = 0; i2 < 8; i2++) {
				if(i1 == i2 || i2 == (M.length-1)-i1) M[i1][i2] = 1;
				else M[i1][i2] = 0;
				
			}
		}
		//Mostramos la salida
		System.out.print("\n");
		for(i1 = 0; i1 < 8; i1++) {
			for(i2 = 0; i2 < 8; i2++) {
				System.out.print(M[i1][i2] + " ");
			}
		System.out.print("\n");
		}

	}

}
