package sentenciaFOR;

public class SentenciaFor {
	public static void main(String[] args) {
		int v = 0, a = 0, b = 0;
		/*
		for(v=0;v<12;v++) {
			System.out.print("Valor de V =>");
			System.out.println(v);
		}
		System.out.print("Valor de Salida de V => " + v);
		*/
	//************************FOR ANIDADAS****************************
	//Se pueden quitar las llaves
		for(v=0;v<3;v++) {
			for(a=3;a<7;a++) {
				for(b=2;b<5;b++) {
					System.out.println("V => " + v + "\ta => " + a + "\tb => " + b);
				}
			}
		}
	}
}
