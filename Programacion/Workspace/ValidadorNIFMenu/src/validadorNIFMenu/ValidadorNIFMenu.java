package validadorNIFMenu;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ValidadorNIFMenu {

	static String letraNIF(int numNIF) {
			String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
			//Retornamos el NIF completo
			return (String.valueOf(numNIF) + String.valueOf(letra.charAt(numNIF%23)));
	}
	
	static void operaciones(int opcion, Scanner input) {
			int numNIF = 0;
			char letraNIF = ' ';
			String inNIF = null, outNIF = null;
			boolean valido;
			//Según la opción introducida ejecuta la acción deseada
			switch(opcion){
					case 1:
							//Generar Letra del DNI
							do {
								try {
									System.out.print("Introduce el numero de NIF: ");
									numNIF = input.nextInt();
								}catch(InputMismatchException ime) {numNIF = 0; input.next();}
								if(String.valueOf(numNIF).length() != 8) System.out.print("Error:Valor Invalido!\n");
							}while(String.valueOf(numNIF).length() != 8);
							System.out.println("El NIF Completo es: " + letraNIF(numNIF));	
							input.nextLine();
							break;
				
				case 2:
						//Validar Letra del DNI
						do {
							valido = true;
							try {
								System.out.print("Introduce el NIF con Letra: ");
								inNIF = input.nextLine();
								//Leemos los datos y los validamos.
								numNIF =  Integer.parseInt(inNIF.substring(0,8));
								letraNIF = Character.toUpperCase(inNIF.charAt(8));
								inNIF = String.valueOf(numNIF) + letraNIF;
							//Casos en los que el NIF es Invalido
							}catch(NumberFormatException |StringIndexOutOfBoundsException e) {valido = false;}
							if(inNIF.length() != 9) valido = false;
							if(!Character.isLetter(letraNIF)) valido = false;
							if(numNIF <= 0) valido = false;
							if(!valido) System.out.println("ERROR: Valor Inválido!");
						}while(!valido);
						outNIF = letraNIF(numNIF);
						if(inNIF.equals(outNIF)) System.out.println("NIF VALIDO!");
						else System.out.println("NIF INVÁLIDO!");
						break;
				}
	}
	
	static int menu(Scanner input) {
		//Mostramos el menú de opcines
		int opcion;
		System.out.println("---------------MENU-----------------");
		System.out.println("1) Calcular Letra");
		System.out.println("2) Validar NIF");
		//Verificamos que la entrada sea válida y retornamos ese valor
		do {
			try {
			System.out.print("Introduce una opción (1-2): ");
			opcion = input.nextInt();
			}catch(InputMismatchException ime) {opcion = 3; input.next();}
			if(opcion != 1 && opcion != 2) System.out.println("Valor Inválido!");
		}while(opcion != 1 && opcion != 2);
		input.nextLine();
		return opcion;
	}
	
	public static void main(String[] args) {
		boolean reint = true;
		String opcion = null;
		Scanner Teclado = new Scanner(System.in);
		do {
			operaciones(menu(Teclado), Teclado);
			do {
			System.out.print("Reintentar (S/N):");
			opcion = Teclado.nextLine();
			if(opcion.equals("S") || opcion.equals("s")) reint = true;
			else if(opcion.equals("N") || opcion.equals("n")) reint = false;
			else System.out.println("Opción Inválida!");
			}while(!opcion.equals("S") && !opcion.equals("s") && !opcion.equals("N") && !opcion.equals("n"));
		}while(reint == true);
		Teclado.close();
	}
}
