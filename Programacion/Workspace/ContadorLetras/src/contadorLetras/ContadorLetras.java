package contadorLetras;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class ContadorLetras {
public static String[]  vectorfrases;

static void introducirfrase(Scanner input) {
	//Definimos el numero de frases y llenamos cada slot
	int indexfrases = 0;
	boolean error;
	do {
		error = false;
		try {
			System.out.print("Introduce el numero de frases: ");
			indexfrases = input.nextInt();
			input.nextLine();
		}catch(InputMismatchException ime) {error = true;}
		if(error) {System.out.println("Valor invalido... Introduce un número..."); input.nextLine(); }
	}while(error == true);
	vectorfrases = new String[indexfrases];
	for(int i = 0; i < indexfrases; i++) {
		System.out.print("Introduce la cadena para la posicion " +( i+1) +" : " );
		vectorfrases[i] =input.nextLine().toLowerCase();
	}
}


static void visualizarfrase() {
	//Verificamos si el vector contiene frases y las mostramos
	if(!vectornulo(vectorfrases)) {
		for(int i = 0; i < vectorfrases.length;  i++) System.out.println(vectorfrases[i]);
		}
	}

//Verifica que el vector introducido no sea nulo
static boolean vectornulo(String[] vector) {
	if(vector != null) return false;
	else System.out.println("El vector esta vacio!..."); return true;
}

static void contadorletras(Scanner input) {
	//Leemos un caracter y lo validamos
	if(!vectornulo(vectorfrases)) {
		String caracter = null;
		int contador = 0;
		do {
			System.out.print("Introduce una letra: ");
			caracter = input.nextLine();
			if(caracter.length() > 1) System.out.println("Valor Invalido... Introduce solo un carácter...");
		}while(caracter.length() > 1);
		caracter = caracter.toLowerCase();
		
		//Contamos las iteraciones del caracter en cada cadena y devolvemos la suma total como respuesta
		for(int i1 = 0; i1 < vectorfrases.length; i1++) {
			char cadena[] = vectorfrases[i1].toCharArray(); 
			for(int i2= 0; i2 < cadena.length; i2++) {
				if(cadena[i2] == caracter.charAt(0)) contador++;
			}
		}
		System.out.println("La cantidad de ocurrencias del caracter " + caracter.toUpperCase() + " es igual a:"  + contador);
	}
}

static void repeticionescaracter(Scanner input) {
	if(!vectornulo(vectorfrases)) {
		String caracter = null;
		int contador = 0, contadormax = 0, idxcadenamax = 0;
		do {
			System.out.print("Introduce una letra: ");
			caracter = input.nextLine();
			if(caracter.length() > 1) System.out.println("Valor Invalido... Introduce solo un carácter...");
		}while(caracter.length() > 1);
		caracter = caracter.toLowerCase();
		
		//Contamos las iteraciones del caracter en cada cadena y devolvemos la mas alta de todas como respuesta
		for(int i1 = 0; i1 < vectorfrases.length; i1++) {
			char cadena[] = vectorfrases[i1].toCharArray(); 
			for(int i2= 0; i2 < cadena.length; i2++) {
				if(cadena[i2] == caracter.charAt(0)) contador++;
			}
			if(contador > contadormax) {
				contadormax = contador ;
				idxcadenamax = i1;
			}
			contador = 0;
		}
		System.out.println("La cadena con mas ocurrencias del caracter " + caracter.toUpperCase() + " es "  + vectorfrases[idxcadenamax]);
		System.out.println("Con " + contadormax + " ocurrencias.");
	}
}

static void frasemaslarga() {
	//Calculamos el indice de la frase mas larga
	int indexlargo = 0, longitud = 0;
	ArrayList<Integer> fraseslargas = new ArrayList<Integer>();
	if(!vectornulo(vectorfrases)) {
		for(int i = 0; i < vectorfrases.length; i++) {
			if(indexlargo < vectorfrases[i].length()) {
				indexlargo=i; 
				longitud = vectorfrases[i].length();
			}
		}
		
		//Verificamos si existen frases de igual longitud
		for(int i = 0; i < vectorfrases.length; i++) {
			if(vectorfrases[i].length() == longitud) fraseslargas.add(i);
		}
		//Si hay mas de una
		if(fraseslargas.size() > 1) {
			System.out.println("Las frases mas largas son:");
			for(int i = 0; i < fraseslargas.size(); i++) {
				System.out.println(vectorfrases[fraseslargas.get(i)]);
			}
			System.out.println("Con una longitud de: " + longitud + " caracteres");
		}
		//Si es una sola
		else {
			//Devolvemos la frase mas larga y su longitud
			System.out.println("La frase mas larga es: " + vectorfrases[indexlargo] );
			System.out.println("Con una longitud de: " + longitud + " caracteres");
		}
	}
}

	public static void main(String[] args) {
		//Menu principal
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do {
		//Mostramos el menú de opciones
		System.out.println("---------------MENU-----------------");
		System.out.println("1) Llenar Vector");
		System.out.println("2) Visualizar Vector");
		System.out.println("3) Contar ocurrencias de una letra");
		System.out.println("4) Frase(s) mas larga(s)");
		System.out.println("5) Frase con mas ocurrencias de un caracter");
		System.out.println("6) Contador tipos de caracteres");
		System.out.println("7) Salir");
		
		//Verificamos que la entrada sea válida y retornamos ese valor
			try {
			System.out.print("Introduce una opción (1-6): ");
			opcion = teclado.nextInt();
			}catch(InputMismatchException ime) {opcion = 7; teclado.next();}
			if(opcion < 1 || opcion > 7) System.out.println("Valor Inválido!...");
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
					contadorletras(teclado);
					break;
				case 4:
					frasemaslarga();
					break;
				case 5:
					repeticionescaracter(teclado);
					break;
				}
			}
		}while(opcion != 7);
	    teclado.close();
	}
}