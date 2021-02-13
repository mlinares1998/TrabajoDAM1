package cadenas_00;
public class Cadenas_00 {
	public static void main(String[] args){
		String cadena = "Esto es una prueba";
		System.out.println(cadena);
		cadena = "Esto es otra prueba con \ttabulador";
		System.out.println(cadena);
		cadena = "Mi nombre es \u0045milio";
		System.out.println(cadena);
		cadena = "\u004D\u0061\u0072\u00ED\u0061";
		System.out.println("......................"+cadena);
		cadena = "Esto es un \"texto\" con comillas";
		System.out.println(cadena);
	}
}
