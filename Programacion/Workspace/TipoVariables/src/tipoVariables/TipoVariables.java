package tipoVariables;
import java.util.Scanner;
public class TipoVariables {
	public static void main(String[] args) {
		/*******************Variables de Valores Enteros******************/
		byte vByte = 0;
		short vShort = 0;
		int vInt = 0;
		long vLong = 0;
		/********Variables de valores con decimales (Coma flotante)*******/
		float vFloat = 0;
		double vDouble = 0;
		/**********************Rangos Soportados**************************/
		System.out.println("Valor Mínimo de vByte =" + Byte.MIN_VALUE);
		System.out.println("Valor Mínimo de vShort =" + Short.MIN_VALUE);
		System.out.println("Valor Mínimo de vInt =" + Integer.MIN_VALUE);
		System.out.println("Valor Mínimo de vLong =" + Long.MIN_VALUE);
		System.out.println("Valor Mínimo de vFloat =" + Float.MIN_VALUE);
		System.out.println("Valor Mínimo de vDouble =" + Double.MIN_VALUE);
		
		System.out.println("Valor Máximo de vByte =" + Byte.MAX_VALUE);
		System.out.println("Valor Máximo de vShort =" + Short.MAX_VALUE);
		System.out.println("Valor Máximo de vInt =" + Integer.MAX_VALUE);
		System.out.println("Valor Máximo de vLong =" + Long.MAX_VALUE);
		System.out.println("Valor Máximo de vFloat =" + Float.MAX_VALUE);
		System.out.println("Valor Máximo de vDouble =" + Double.MAX_VALUE);
	}
}
