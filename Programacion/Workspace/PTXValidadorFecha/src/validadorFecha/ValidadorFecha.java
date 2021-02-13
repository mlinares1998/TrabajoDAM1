//Validador de Fechas Calendario Gregoriano
package validadorFecha;
import java.util.Scanner;
public class ValidadorFecha {
	public static void main(String[] args) {
		int ano = 0, mes = 0, dia = 0;
		boolean bisiesto = false, valido = false;
		Scanner Teclado = new Scanner(System.in);
		System.out.print("Introduce el año: ");
		ano = Teclado.nextInt();
		System.out.print("Introduce el mes: ");
		mes = Teclado.nextInt();
		System.out.print("Introduce el dia: ");
		dia = Teclado.nextInt();
		Teclado.close();
		//Validamos si la fecha esta en el rango (CHECK1)
		if((ano > 0 && ano < 3000) && (mes > 0 && mes <= 12) && (dia > 0 && dia <= 31)) {
			//Verificamos si el Año es Bisiesto (CHECK2)
			if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) bisiesto = true;
			else bisiesto = false;
			//Verificamos si el día es valido para cada mes (CHECK3)
			switch(mes) {
				case 2:
					if(bisiesto && dia <= 29) valido = true;
					else {
						if(dia <= 28) valido = true;
						else valido = false;
					}
					break;
				case 4,6,9,11:
					if(dia <= 31) valido = true;
					else valido = false;
					break;
				
				default:
					if(dia <= 30) valido = true;
					else valido = false;
					break;
			}
		}
		else valido = false;
		
		if(valido) System.out.print("Fecha Valida");
		else System.out.print("Fecha Invalida");
	}

}
