package serieFigonacci;
import java.util.Scanner;
public class SerieFigonacci {
	public static void main(String[] args) {
		int Num1 = 0, Num2 = 1, Aux = 1, Lim;
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Teclea el valor máximo: ");
		Lim = Teclado.nextInt();
		Teclado.close();
		System.out.print(Num1);
		do{
			System.out.print(" " + Aux);
			Aux = Num1 + Num2;
			Num1 = Num2;
			Num2 = Aux;
		}while(Num2 <= Lim);
		System.out.print("\nFIN DE PROGRAMA");
		
		
	}

}
