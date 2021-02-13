package restaSumaDosNumeros;
import java.util.Scanner;
public class RestaSumaDosNumeros {
	public static void main(String[] args) {
		//Creamos un Scanner Entrada
		Scanner entrada = new Scanner(System.in);
		//Definimos las Vaiables
		int num1 = 0, num2 = 0;
		//Pedimos el Primer Valor
		System.out.print("Introduce el Primer Número: ");
		num1 = entrada.nextInt();
		//Pedimos el segundo Valor
		System.out.print("Introduce el Segundo Número: ");
		num2 = entrada.nextInt();
		//Cerramos el Scanner
		entrada.close(); 
		//Verificamos
		if (num1 >= num2) {
			System.out.print(num1 + "-" + num2 + "=" + (num1-num2));
		}
		else {
			System.out.print(num1 + "+" + num2 + "=" + (num1+num2));
		}
	}

}
