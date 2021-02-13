package ahorcado;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ahorcado {
	//Variables globales
	static String frase = null;
	static char fraseoculta[];
	static int contador[] =  {0,0};
	static int fallos;
	
	//Metodo para Guardar la frase en memoria
	static void introducirfrase(Scanner input) {
		System.out.print("Introduce la frase: ");
		frase = input.nextLine();
		frase = frase.toUpperCase();
		System.out.println("Frase Introducida...");
	}
	
	//Metodo para visualizar la frase guardada en memoria
	static void visualizarfrase() {
		if(frase != null) System.out.println("\nLa frase actual es: " + frase);
		else System.out.println("\nNo has introducido ninguna frase...");
	}
	
	//Metodo para validar si existe una frase en memoria
	static boolean visualizarfrase(String frase)  {
		if(frase == null) {
			System.out.println("\nNo has introducido ninguna frase...");
			return false;
		}
		else return true;
		
	}
	
	//Metodo para ocultar la palabra
	static void ocultarpalabra(String frase) {
		fraseoculta = frase.toCharArray();
		for(int i = 0; i < fraseoculta.length;i++) {
			fraseoculta[i] = '-';
		}
	}
	
	static int validarletra(String letra) {
		if(letra.length() > 1) return 1;
		else if(letra.isEmpty()) return 1;
		else if(!Character.isLetter(letra.charAt(0))) return 1;
		else if(String.valueOf(fraseoculta).contains(letra)) return 2;
		else
			return 0;
	}
	
	//Metodo principal del juego
	static void juego(Scanner input) {
		String letra = null;
		fallos = 0;
		boolean ganador = false;
		boolean encontrado = false;
		if(!visualizarfrase(frase)) return;
		//Creamos un Array con la frase oculta
		ocultarpalabra(frase);
		do {
			encontrado = false;
			System.out.println("Te quedan " + (3 - fallos) + " Intentos...\n\n\n");
			for(int i = 0; i < fraseoculta.length; i++) System.out.print(fraseoculta[i] + " ");
			System.out.println("\n"); 
			System.out.print("Introduce una letra: ");
			letra = input.nextLine();
			letra = letra.toUpperCase();
			System.out.println();
			if(validarletra(letra) == 1) {
				System.out.println("Valor Invalido: Introduce solo una letra!...");
				System.out.println("Pierdes por listillo, A TOMAR!!");
				break;
			}
			else if(validarletra(letra) == 2) {
				System.out.println("Letra ya introducida!...");
				System.out.println("Pierdes un intento!");
				fallos++;
				continue;
			}
			for(int i = 0; i < fraseoculta.length; i++) {
				if(letra.charAt(0) == frase.charAt(i))  {
					fraseoculta[i] = letra.charAt(0);
					encontrado = true;		
				}
			}
			if(!encontrado) fallos++;
			if(String.valueOf(fraseoculta).equals(frase)) ganador = true;
		}while(fallos < 3 && ganador == false);
		
		if(ganador) {
			System.out.println("\n\nGANASTE\n");
			contador[0]++;
		}
		else {
			System.out.println("\n\nPerdiste...\n\n");
			contador[1]++;
		}
		System.out.println("La frase era: " + frase);
	}
	
	//Menu Principal
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do {
		//Mostramos el menú de opciones
		System.out.println("---------------MENU-----------------");
		System.out.println("Ganadas: " + contador[0] + "  Perdidas: " + contador[1]);
		System.out.println("1) Teclear Frase");
		System.out.println("2) Visualizar Frase");
		System.out.println("3) Jugar!!!");
		System.out.println("4) Salir");
		//Verificamos que la entrada sea válida y retornamos ese valor
			try {
			System.out.print("Introduce una opción (1-4): ");
			opcion = teclado.nextInt();
			}catch(InputMismatchException ime) {opcion = 5; teclado.next();}
			if(opcion < 1 || opcion > 4) System.out.println("Valor Inválido!");
			else {
				teclado.nextLine();
				switch(opcion) {
				case 1:
					introducirfrase(teclado);
					break;
				case 2:
					visualizarfrase();
					break;
				case 3:
					juego(teclado);
					break;
				}
			}
		}while(opcion != 4);
	    teclado.close();
	}

}
