//Calculo Hora
package ej1_6;
import java.util.Scanner;
public class EJ1_6 {
	public static void main(String[] args) {
		float segundos, minutos, horas;
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Introduce los Segundos: ");
		segundos = Teclado.nextInt();
		horas = (int)(segundos / 3600);
		segundos -= horas * 3600;
		minutos = (int)(segundos / 60);
		segundos -= minutos * 60;
		//Salida
		System.out.print("\nHoras: " + (int)horas);
		System.out.print("\nMinutos: " + (int)minutos);
		System.out.print("\nSegundos: " + (int)segundos);
		Teclado.close();
		
		

	}

}
