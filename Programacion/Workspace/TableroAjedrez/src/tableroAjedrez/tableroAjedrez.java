package tableroAjedrez;

public class tableroAjedrez {

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
		//Llenamos con 0s y 1s
		for(i1 = 0; i1 < 8; i1++) {
			for (i2 = 0; i2 < 8; i2++) {
				if(i1 % 2 == 0) {
					if(i2 % 2 == 0) M[i1][i2] = 1;
					else M[i1][i2] = 0;
				}
				else {
					if(i2 % 2 == 0) M[i1][i2] = 0;
					else M[i1][i2] = 1;
				}		
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
