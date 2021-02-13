//V2
package cajero;
import java.util.Scanner;
public class Cajero {
	public static void main(String[] args) {
		int total = 0, precio = 0, pago = 0, acumulado = 0, contcliente = 0, otro = 0, activo = 1;
		Scanner Teclado = new Scanner(System.in);
		do {
			do {
				System.out.print("Introduce Precio (Escriba 0 para Finalizar): ");
				precio = Teclado.nextInt();
				total = total + precio;
			}while(precio != 0);
			System.out.println("Total: " + total + " EUR");
			do {
				System.out.print("Introduce Pago: ");
				pago = Teclado.nextInt();
				if(pago < total) System.out.println("Faltan: " + (total - pago));
			}while(pago < total);
			System.out.println("Su Cambio: " + (pago - total) + " EUR");
			do {
			System.out.print("Otro Cliente (1/0): ");
			otro = Teclado.nextInt();
			}while (otro != 0 && otro != 1);
			if(otro == 0) {
				activo = 0;
			}
			contcliente = contcliente + 1;
			acumulado = acumulado + total;
			total = 0;
		}while(activo == 1);
		Teclado.close();
		System.out.println("Total día: " + acumulado);
		System.out.println("Número clientes: " + contcliente);
		System.out.println("Gasto Medio Cliente: " + (acumulado/contcliente));
	}
}

//V1
/* package cajero;
import java.util.Scanner;
public class Cajero {
	public static void main(String[] args) {
		int total = 0, precio = 0, pago = 0;
		Scanner Teclado = new Scanner(System.in);
		do {
			System.out.print("Introduce Precio: ");
			precio = Teclado.nextInt();
			total = total + precio;
		}while(precio != 0);
		System.out.println("Total: " + total + " EUR");
		do {
			System.out.print("Introduce Pago: ");
			pago = pago + Teclado.nextInt();
			if(pago < total) System.out.println("Faltan " + (total - pago) + " EUR");
		}while(pago < total);
		Teclado.close();
		System.out.print("Su Cambio: " + (pago - total));
	}
}
*/