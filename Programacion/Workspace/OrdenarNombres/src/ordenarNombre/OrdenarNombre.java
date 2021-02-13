package ordenarNombre;
import java.util.Scanner;
public class OrdenarNombre {
	
	//Método para leer los nombres
	static String[] inputNombres(Scanner input, String[] array) {
		for (int i = 0; i<10;i++) {
			do {
				System.out.print("Introduce el Nombre " + (i+1) + " :");
				array[i] =input.nextLine();
				if(validarNombre(array[i]) == false) System.out.println("Valor Inválido!");
			}while(validarNombre(array[i]) == false);
		}
		return array;
	}
	
	static boolean validarNombre(String nombre) {
		boolean valido = true;
		char nombrechar[] = nombre.toCharArray();
		for(int i = 0; i < nombrechar.length; i++) {
			if(Character.isLetter(nombrechar[i]) == false) valido = false;
		}
		return valido;
	}
	//Método para mostrar los nombres en pantalla
	static void outNombres (String[] array) {
		for(int i = 0; i < 10; i++) {
			System.out.println(array[i]);
		}
	}
	//Metodo para ordenar nombres por orden alfabético.
	static void ordenaNombres (String[] array) {
		String aux = null;
		//Aplicamos el método de la burbuja
		for(int i1 = 0; i1 < array.length -1; i1++) {
			for(int i2 = i1; i2 < array.length; i2++) {
				//Verificamos si array[i1] esta por delante de array [i2] (ASCII)
				if(array[i1].compareToIgnoreCase(array[i2]) > 0) {
					aux = array[i2];
					array[i2] = array[i1];
					array[i1] = aux;
				}
			}
		}
		return;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] arrayNombres = new String[10];
		inputNombres(teclado, arrayNombres);
		System.out.println("--------------NOMBRES DESORDENADOS---------------");
		outNombres(arrayNombres);
		ordenaNombres(arrayNombres);
		System.out.println("------------------NOMBRES ORDENADOS------------------");
		outNombres(arrayNombres);
		teclado.close();
		
		
	}

}
