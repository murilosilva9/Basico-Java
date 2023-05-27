package Arrays;

import java.util.Scanner;

public class Vetores {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetor = {-5,-1,0,1,5};
		
		String[] consoantes = new String[6];
		String letra;
		
		int contador =0;
		
		do {
			System.out.println("digite a letra");
			letra = scan.next();
			
			if (!(letra.equalsIgnoreCase("a") ||
					letra.equalsIgnoreCase("e") ||
					letra.equalsIgnoreCase("i") ||
					letra.equalsIgnoreCase("o") ||
					letra.equalsIgnoreCase("u"))) {
				consoantes[contador] = letra;
				
			}
			contador++;	
		}
		while( contador < consoantes.length );
		
		for(String consoante : consoantes) {
			
			if(consoante != null) {
			System.out.println(consoante);
			}
		}
	}

}
