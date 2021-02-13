package codificaMensaje;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CodificaMensaje {
	//Declaramos frase como static y como variable global de la clase
	static String frase = null;
	
	//Guardamos la frase en memoria
	static void introduceFrase(Scanner input) {
		System.out.print("Introduce la frase: ");
		frase = input.nextLine();
		System.out.println("Frase Introducida...");
	}
	//Codificamos la frase en memoria siguiendo los criterios
	static void codificaFrase(Scanner input) {
		//Convertimos a Char Array
		char[] frasetoarray = frase.toCharArray();
		//Encriptado
		for(int i = 0; i < frasetoarray.length; i++) {
			switch(frasetoarray[i]) {
			case 'Z':
				frasetoarray[i] = 'A';
				break;
			case 'z':
				frasetoarray[i] = 'a';
				break;
			case ',':
				frasetoarray[i] = '-';
				break;
			case '.':
				frasetoarray[i] = '+';
				break;
			case ' ':
				frasetoarray[i] = '*';
				break;
			default:
				frasetoarray[i]++;
			}
		}
		//Guardamos la frase encriptada en memoria
		frase = String.valueOf(frasetoarray);
		System.out.println("Frase Codificada...");
	}
	
	
	static void decodificarFrase(Scanner input) {
		//Convertimos a Char Array
		char[] frasetoarray = frase.toCharArray();
		//Decodificado
		for(int i = 0; i < frasetoarray.length; i++) {
			switch(frasetoarray[i]) {
			case 'A':
				frasetoarray[i] = 'Z';
				break;
			case 'a':
				frasetoarray[i] = 'z';
				break;
			case '-':
				frasetoarray[i] = ',';
				break;
			case '+':
				frasetoarray[i] = '.';
				break;
			case '*':
				frasetoarray[i] = ' ';
				break;
			default:
				frasetoarray[i]--;
			}
		}
		//Guardamos la frase decodificada en memoria
		frase = String.valueOf(frasetoarray);
		System.out.println("Frase Decodificada...");
	}
	//Mostramos la frase en pantalla
	static void visualizarFrase() {
		if(frase != null) System.out.println("\nLa frase actual es: " + frase);
		else System.out.println("\nNo has introducido ninguna frase...");
	}
	
	//Selector de operaciones
	static void  operaciones(int opcion, Scanner input) {
		switch(opcion) {
		case 1: 
			introduceFrase(input);
			break;
		case 2: 
			codificaFrase(input);
			break;
		case 3:
			decodificarFrase(input);
			break;
		case 4:
			visualizarFrase();
			break;
		}
	}
	
	//Menu Principal	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do {
		//Mostramos el menú de opcines
		System.out.println("---------------MENU-----------------");
		System.out.println("1) Teclear Frase");
		System.out.println("2) Codificar Frase");
		System.out.println("3) Decodificar Frase");
		System.out.println("4) Visualizar Frase");
		System.out.println("5) Salir");
		//Verificamos que la entrada sea válida y retornamos ese valor
			try {
			System.out.print("Introduce una opción (1-5): ");
			opcion = teclado.nextInt();
			}catch(InputMismatchException ime) {opcion = 6; teclado.next();}
			if(opcion < 1 || opcion > 5) System.out.println("Valor Inválido!");
			else {
				teclado.nextLine();
				operaciones(opcion,teclado);
			}
		}while(opcion != 5);
	    teclado.close();
	}

}
