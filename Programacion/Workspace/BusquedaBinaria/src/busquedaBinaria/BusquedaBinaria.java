package busquedaBinaria;
import java.util.Scanner;
public class BusquedaBinaria {
	//Ordenamos el vector
	public static void main(String[] args) {
		int tabla[] = {100,23,2,45,78,66,61,55,27,30};
		int aux = 0, i1 = 0, i2 = 0;
		
		Scanner Teclado = new Scanner(System.in);
		//Organiza la tabla de menor a mayor
		for(i2 = 0; i2 < tabla.length -1; i2++) {
			for(i1 = i2; i1 < tabla.length; i1++) {
				if(tabla[i1] < tabla[i2]) {
					aux = tabla[i2];
					tabla[i2] = tabla[i1];
					tabla[i1] = aux;
				}
			}
		}
		System.out.println("Tabla Ordenada");
		for(i1 = 0; i1 <10; i1++) {
			System.out.print(tabla[i1] + "  ");
			}
		//Busqueda Binaria
		int num = 0, iizq = 0, imed = 0, ider = 9;
		boolean encontrado = false;
		System.out.print("\nEscribe el numero a buscar: ");
		num = Teclado.nextInt();
		Teclado.close();
		do {
			imed =(iizq + ider)/2;
			if(num == tabla[imed]) encontrado = true;
			else {
				if(num > tabla[imed]) iizq = iizq + 1;
				else ider = imed -1 ;
			}
		}while(encontrado == false && ((iizq <= ider) && num!=tabla[imed]));
		if(encontrado == true) System.out.print("Encontrado");
		else System.out.print("No Encontrado");
	}
}
