package cadenas_04;

public class Cadenas_04 {
	public static void main(String[] args){
		String cadena="Esta es una cadena para demostrar las funciones";
		char caracter1 = ' ', caracter2 = '\t';
		System.out.println("La cadena es -> "+cadena);
		System.out.println("los caractres son: caracter1 -> "+caracter1+ " y caracter2 -> "+caracter2);
		
		System.out.println("\n\nTodas las funciones siguientes son de la clase \"Character\".");
		System.out.println("\nLa función \"isDigit()\" indica si el caracter es un dígito");
		System.out.println("Si es un dígito devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("Con caracter1 devuelve -> "+Character.isDigit(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.isDigit(caracter2));
		
		System.out.println("\nLa función \"isLetter()\" indica si el caracter es una letra");
		System.out.println("Si es una letra devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("Con caracter1 devuelve -> "+Character.isLetter(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.isLetter(caracter2));	

		System.out.println("\nLa función \"isLetterOrDigit()\" indica si el caracter es una letra");
		System.out.println("Si es una letra o un dígito devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("Con caracter1 devuelve -> "+Character.isLetterOrDigit(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.isLetterOrDigit(caracter2));
			
		System.out.println("\nLa función \"isLowerCase()\" indica si el caracter es una letra minúscula");
		System.out.println("Si es una letra o una letra minúscula devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("Con caracter1 devuelve -> "+Character.isLowerCase(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.isLowerCase(caracter2));
				
		System.out.println("\nLa función \"isUpperCase()\" indica si el caracter es una letra mayúscula");
		System.out.println("Si es una letra o una letra mayúscula devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("Con caracter1 devuelve -> "+Character.isUpperCase(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.isUpperCase(caracter2));
		
		System.out.println("\nLa función \"isSpaceChar()\" indica si el caracter es un espacio en blanco");
		System.out.println("Si es  un espacio en blanco devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("Con caracter1 devuelve -> "+Character.isSpaceChar(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.isSpaceChar(caracter2));		
		
		System.out.println("\nLa función \"isWhiteSpace()\" indica si el caracter es un espacio en blanco sin representación al imprimirse");
		System.out.println("Si es una letra o un espacio en blanco sin representación al imprimirse devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("Con caracter1 devuelve -> "+Character.isWhitespace(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.isWhitespace(caracter2));	
		
		System.out.println("\nLa función \"toLowerCase()\" si la letra es mayúscula la devuelve minúscula, si es minúscula la deja como está\n");
		System.out.println("Con caracter1 devuelve -> "+Character.toLowerCase(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.toLowerCase(caracter2));	
		
		System.out.println("\nLa función \"toUpperCase()\" si la letra es minúscula la devuelve mayúscula, si es mayúscula la deja como está\n");
		System.out.println("Con caracter1 devuelve -> "+Character.toUpperCase(caracter1));
		System.out.println("Con caracter2 devuelve -> "+Character.toUpperCase(caracter2));		
		
	}
}
