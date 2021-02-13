package sentenciaWhile;
public class SentenciaWhile {
	public static void main(String[] args) {
		int cont = 0;
	/************************************************************************/
	/************************Sentencia While*********************************/
	/************************************************************************/
		while(cont<10) {
			cont=cont+1;
			System.out.println(cont);
		}
		System.out.print("FIN DE PROGRAMA");
	/************************************************************************/
	/************************Sentencia Do While*********************************/
	/************************************************************************/	
		cont = 0;
		do{
			cont=cont + 1;
			System.out.println(cont);
		}while(cont<10);
	}

}
