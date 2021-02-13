package cadenas_01;
public class Cadenas_01 {
	public static void main(String[] args){
		String nombre, apellidos, nombreCompleto;
		nombre = "José";
		apellidos = "González Pérez";
		System.out.println("\tConcatenación\n");
		nombreCompleto = nombre +" "+ apellidos;
		System.out.println("nombre = "+nombre);
		System.out.println("apellidos = "+apellidos);
		System.out.println("nombreCompleto = nombre +\" \"+apellidos = "+nombreCompleto);
		System.out.println("Con la función concat-> "+nombre.concat(apellidos));
	}
}
