//Estructura selectiva
//Se solicitan las coordenadas de los puntos P1 y P2 en un plano XY y
//Se presenta la distancia entre estos puntos.
//Los limites del plano tanto en X como en Y son -100, +100
package distanciaPuntos;
import java.util.Scanner;
public class DistanciaPuntos {
	public static void main(String[] args) {
		int p1x = 0, p1y = 0, p2x = 0, p2y = 0;
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Introduce la coordenada X de P1: ");
		p1x = Teclado.nextInt();
		System.out.print("Introduce la coordenada Y de P1: ");
		p1y = Teclado.nextInt();
		System.out.print("Introduce la coordenada X de P2: ");
		p2x = Teclado.nextInt();
		System.out.print("Introduce la coordenada Y de P2: ");
		p2y = Teclado.nextInt();
		Teclado.close();
		
		//Verificamos que los valores esten dentro del rango
		if((p1x < -100 || p1x > 100) || (p1y < -100 || p1y > 100) || 
			(p2x < -100 || p2x > 100) || (p2y < -100 || p2y > 100)) {
			System.out.print("Fuera de Rango! ");
		}
		else {
			//Hacemos uso  del teorema de Pitágoras para calcular la distancia entre los puntos.
			System.out.print("La distancia entre P1 y P2 es: " + 
			Math.sqrt(Math.pow(p2x-p1x, 2)+Math.pow(p2y - p1y,2)));
		}	
	}
}
