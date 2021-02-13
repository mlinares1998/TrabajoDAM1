package metodos_00;

public class Metodos_00 {
	static void metodo1() {
		System.out.println("Dentro del metodo 1");
		System.out.println("Llamada al método 1_1");
		metodo1_1();
		System.out.println("retorno del método 1_1");
	}
	static void metodo2() {
		System.out.println("Dentro del metodo 1");
	}
	static void metodo3() {
		System.out.println("Dentro del metodo 3");
		System.out.println("Llamada al método 1 desde métido 3");
		metodo1();
		System.out.println("Retorno del método 1 al método 3");
	}
	static void metodo1_1() {
		System.out.println("Dentro del metodo 1_1");
	}
	public static void main(String[] args) {
		System.out.println("Llamada al método 1");
		metodo1();
		System.out.println("Retorno del método 1");
		System.out.println("Llamada al método 2");
		metodo2();
		System.out.println("Retorno del método 2");
		System.out.println("Llamada al método 3");
		metodo3();
		System.out.println("Retorno del método 3");
		System.out.println("Fin del Programa");
	}
}
