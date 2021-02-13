package calcIVA;
import java.util.Scanner;
public class CalcIVA {
	public static void main(String[] args) {
	float Base, IVA;
	Scanner Teclado = new Scanner(System.in);
	System.out.print("Introduce la Base Imponible: ");
	Base = Teclado.nextFloat();
	System.out.print("Introduce el IVA: ");
	IVA = Teclado.nextFloat();
	Teclado.close();
	IVA /= 100;
	IVA *= Base;
	System.out.print("El total es: " + (Base + IVA));
	} 

}
