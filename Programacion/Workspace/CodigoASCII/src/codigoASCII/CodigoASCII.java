package codigoASCII;
public class CodigoASCII {

	public static void main(String[] args) {
		for(int i = 0; i< 256;i++) {
			System.out.println("Codigo: " + i + " / Carácter: " + (char)i);
		}
		for(char c = 'a' ; c <= 'z' ; c++) {
			System.out.println("Carácter " + c + " /Código: " + (int)c);
		}
	}
}
