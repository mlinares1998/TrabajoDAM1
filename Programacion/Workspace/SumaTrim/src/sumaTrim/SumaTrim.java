package sumaTrim;
import java.util.Scanner;
public class SumaTrim {
	public static void main(String[] args) {
		int imp[] = new int[12], trim[] = new int[4], iimporte = 0, itrimestre = 0;
		Scanner Teclado = new Scanner(System.in);
		for(iimporte=0;iimporte<12;iimporte++) {
			System.out.print("Introduce monto: ");
			imp[iimporte] = Teclado.nextInt();
		}
		for(iimporte=0;iimporte<12;iimporte++) {
			if(iimporte%3 == 0 && iimporte != 0) {
				itrimestre++;
			}
			trim[itrimestre]+=imp[iimporte];
		}
		for(itrimestre = 0; itrimestre < 4; itrimestre++) {
			System.out.println("Trimestre " + (itrimestre + 1) + ": " +trim[itrimestre]);
		}
	}

}
