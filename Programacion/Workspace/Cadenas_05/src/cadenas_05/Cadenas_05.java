package cadenas_05;


public class Cadenas_05 {
	public static void main(String[] args){
		String cadena="Esta es una cadena para demostrar las funciones";
		String cadena1,subCad;
		System.out.println("La cadena es -> "+cadena);
		System.out.println("\n\nTodas las funciones siguientes son de la clase \"Cadena\".");
	
		System.out.println("\nLa función \"toCharArray()\" convierte una cadena en un vector.");
		char vc[];
		int i;
		vc=cadena.toCharArray();
		for(i=0;i<cadena.length();i++){
			System.out.print(vc[i]+"   ");	 
			
		}
		
		System.out.println("\nLa función \"copyValueOf(char[] tabla)\" convierte un vector en cadena.");
		cadena1=String.copyValueOf(vc);
		System.out.println("La cadena1 tiene es --> "+cadena1);

		System.out.println("\nLa función \"copyValueOf(char[] tabla, int ini, int numcarac)\" convierte un vector en cadena, a partir del elemento indicado y con los nnumcarac siguientes.");
		cadena1=String.copyValueOf(vc, 9,7);
		System.out.println("La cadena1 tiene es --> "+cadena1);
		
		System.out.println("\nLa función \"endsWith(cadfin)\" indica si la cadena finaliza en la cadena indicada 'cadfin'.");
		System.out.println("Si finaliza en dicha cadena devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("La cadena finaliza en 'iones' y devuelve --> "+cadena.endsWith("iones"));
		System.out.println("La cadena finaliza en 'fin' y devuelve --> "+cadena.endsWith("fin"));
		
		System.out.println("\nLa función\"getChars(int ini, int fin char[] tabla, int posTabla)\" convierte un vector en cadena.");
		System.out.println("Desde la posición 'ini' de la cadena y hasta la posición anterior de la marcada por 'fin'...");
		System.out.println("En el vector 'tabla' a partir de la posición 'posTab' de dicho vector.\n");
		vc = new char[20];
		for(i=0;i<20;i++)
			vc[i]='*';
		for(i=0;i<20;i++)
			System.out.print(vc[i]);
	
			cadena.getChars(5,15,vc,2);
		System.out.println();
		System.out.println(vc);
	
		for(i=0;i<20;i++){
			System.out.println(vc[i]);
//		try{
//	        Thread.sleep(1000);// Retardo de un segundo, 1000 milisegundos
//	     }catch(Exception e){}
		}
		cadena = "Estamos de vacaciones en el caribe";
		System.out.println( "La cadena contiene ----> "+cadena);
		char caracter = 'd';
		System.out.println( "El Caracter contiene ----> "+caracter);
		System.out.println("\nLa funci�n \"indexOf(caracter)\" indica la posici�n que ocupa en la cadena la primera ocurrencia del 'caracter'.");
		System.out.println("La primera ocurrencia de "+caracter+"esta en la posici�n --> "+cadena.indexOf(caracter));

		System.out.println("\nLa funci�n \"indexOf(caracter,posini)\" indica la posici�n que ocupa en la cadena la primera ocurrencia del 'caracter'.");
		System.out.println("comenzando la b�squeda a partir de la posicion inicial 'posini'.");
		System.out.println("La primera ocurrencia de "+caracter+"esta en la posici�n --> "+cadena.indexOf(caracter,2));
		caracter = 'a';
	
		System.out.println("\nLa funci�n \"lastIndexOf(caracter)\" indica la posici�n que ocupa en la cadena la �ltima ocurrencia del 'caracter'.");
		System.out.println("La primera ocurrencia de "+caracter+" est� en la posici�n --> "+cadena.lastIndexOf(caracter));

		System.out.println("\nLa funci�n \"lastIndexOf(caracter,posini)\" indica la posici�n que ocupa en la cadena la �ltima ocurrencia del 'caracter'.");
		System.out.println("a partir de la posici�n de inicio 'posini'.");
		System.out.println("La primera ocurrencia de "+caracter+" est� en la posici�n --> "+cadena.lastIndexOf(caracter,19));
		
		System.out.println("\nLa funci�n \"indexOf(subcadena)\" indica la posici�n que ocupa en la cadena la primera ocurrencia de la 'Sucadena'.");
		subCad="de";
		System.out.println("La primera ocurrencia de "+subCad+"esta en la posici�n --> "+cadena.indexOf(subCad));
	
		System.out.println("\nLa funci�n \"indexOf(subcadena,posini)\" indica la posici�n que ocupa en la cadena la primera ocurrencia de la 'Sucadena'.");
		System.out.println("a partir de la posicion indicada 'posini' contando dicha posici�n.");
		System.out.println("La primera ocurrencia de "+subCad+"esta en la posici�n --> "+cadena.indexOf(subCad,19));
		
		subCad="na";
		System.out.println("\nLa funci�n \"lastIndexOf(subcadena)\" indica la posici�n que ocupa en la cadena la �ltima ocurrencia de la 'subcadena'.");
		System.out.println("La primera ocurrencia de "+subCad+" est� en la posici�n --> "+cadena.lastIndexOf(subCad));

		System.out.println("\nLa funci�n \"lastIndexOf(subcadena,posini)\" indica la posici�n que ocupa en la cadena la �ltima ocurrencia de la 'subcadena'.");
		System.out.println("a partir de la posici�n de inicio 'posini'.");
		System.out.println("La primera ocurrencia de "+subCad+" est� en la posici�n --> "+cadena.lastIndexOf(subCad,13));
		
		System.out.println("\nLa funci�n \"isEmpty()\" devuelve 'true' si est� vac�a y 'false' si no lo est�.");
		String c1="",c2="Ordenador";
		System.out.println("Con la cadena c1 devuelve -> "+c1.isEmpty());
		System.out.println("Con la cadena c2 devuelve -> "+c2.isEmpty());
		
		System.out.println("\nLa funci�n \"length()\" devuelve la longitud de la cadena.");
		System.out.println("La longtud de la cadena: \""+cadena+"\", es --> "+cadena.length());
		
		System.out.println("\nLa funci�n \"regionMatches(ini, cad, inicad, numcar)\", busca en la cadena, a partir de la posici�n 'ini' el");
		System.out.println("fragmento de la cadena 'cad' a partir de la posicion 'inicad' y que tenga 'numcar' caracteres.");
		System.out.println("Devuelve 'true' si la encuentra y 'false' en caso contrario.");
		cadena1 = "No tengo pararayos en casa";
		System.out.println("Si existe --> "+cadena.regionMatches(19, cadena1, 9,4));
		System.out.println("No existe --> "+cadena.regionMatches(19, cadena1, 9,5));
		
		System.out.println("\nLa funci�n \"regionMatches(true/false, ini, cad, inicad, numcar)\", busca en la cadena, a partir de la posici�n 'ini' el");
		System.out.println("fragmento de la cadena 'cad' a partir de la posicion 'inicad' y que tenga 'numcar' caracteres.");
		System.out.println("Dependiendo que el primer par�metro  sea verdadero (true) o falso (false), ignora may�sculas y min�sculas o no las ignora.");
		System.out.println("Devuelve 'true' si la encuentra y 'false' en caso contrario.");
		cadena1 = "No tengo Pararayos en casa";
		System.out.println("Si ignora --> "+cadena.regionMatches(true,19, cadena1, 9,4));
		System.out.println("No ignora --> "+cadena.regionMatches(false,19, cadena1, 9,4));
		
		System.out.println("\nLa funci�n \"replace(carActual, carNuevo)\", cambia todos los caracteres (carActual) por el caracter (carNuevo)en toda la cadena");
		System.out.println("La cadena con '*' en vez de  'a' --> "+cadena.replace('a','*'));

		System.out.println("\nLa funci�n \"startsWith(cadPref)\", comprueba si la cadena comienza con el prefijo indicado (cadPref)");
		System.out.println("Si comienza por dicho prefijo devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("La cadena con 'Esta' devuelve --> "+cadena.startsWith("Esta"));	
		System.out.println("La cadena con 'Esto' devuelve --> "+cadena.startsWith("Esto"));
	
		System.out.println("\nLa funci�n \"startsWith(cadPref, posIni)\", comprueba, a paritr de la posici�n de inicio (posIni) si la cadena comienza con el prefijo indicado (cadPref)");
		System.out.println("Si comienza por dicho prefijo devuelve 'true' y en caso contrario 'false'.\n");
		System.out.println("La cadena con 'Esta' a partir de la posici�n 1 devuelve --> "+cadena.startsWith("Esta",1));	
		System.out.println("La cadena con 'es' a patir de la posicion 5 devuelve    --> "+cadena.startsWith("es",5));
	
		System.out.println("\nLa funci�n \"substring(posIni)\", devuelve la subcadena, de la cadena, desde la posici�n inicial (posIni) hasta el final de dicha cadena.");
		System.out.println("La subcadena de "+cadena+" a partir de la posici�n 15 es --> "+cadena.substring(15));

		System.out.println("\nLa funci�n \"substring(posIni,posFin)\", devuelve la subcadena, de la cadena, ");
		System.out.println("desde la posici�n inicial (posIni) hasta el final (posFin), de dicha cadena.");
		System.out.println("La subcadena de "+cadena+" a partir de la posici�n 15 y hasta la 20 es --> "+cadena.substring(15,20));

		System.out.println("\nLa funci�n \"toUpperCase()\", devuelve la cadena con todas las letras en may�scula");
		System.out.println("La cadena: "+cadena+" se devuelve de la siguiente forma --> "+cadena.toUpperCase());
		cadena1 = cadena.toUpperCase();
		System.out.println("\nLa funci�n \"toLowerCase()\", devuelve la cadena con todas las letras en min�scula");
		System.out.println("La cadena: "+cadena1+" se devuelve de la siguiente forma --> "+cadena1.toLowerCase());
		
		System.out.println("\nLa funci�n \"trim()\", devuelve la cadena sin los caracteres blancos del principio y final, incluidos tabuladores.");
		cadena1 = "\tEsto es una frase             ";
		System.out.println("La cadena: "+cadena1+" se devuelve de la siguiente forma --> "+cadena1.trim()+"sin espacios al principio ni al final.");
	}
}
