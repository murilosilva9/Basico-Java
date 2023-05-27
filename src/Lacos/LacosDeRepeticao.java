package Lacos;

import java.util.Scanner;

public class LacosDeRepeticao {

	public static void main(String[] args) {

		Metodos met = new Metodos();
		
		met.metodo1();
		System.out.println("proximo metodo");
		met.metodo2();
		
		int var1 = 0, var2 = 0;
		
		for (int i = 0;i <2;i++) {
		var1++;
		++var2;
		
		System.out.println("var2 "+var2+"var1 "+var1);
		}
		
		String nome = "sem nome";
		int idade;
		Scanner scan = new Scanner(System.in);
		
		while(!nome.equals("0")) {
			
			System.out.println("nome: ");
			nome = scan.next();
			System.out.println("idade: ");
			idade = scan.nextInt();
			
			
		}
		
				
	}

	
	public static class Metodos {

		int cont = 0;
		int cont3 = 0;

		public void metodo1(){
		
		while (cont < 11) {
			
			cont++;
			
			System.out.println(cont);
			
			if(cont == 5) {
				
				System.out.println("deu break ou continue");				
				//continue;
				break;
			}
			
		}
		}
		
		public void metodo2() {
			
		while (cont3 < 1) {
			
			cont3++;
			
			System.out.println("chegou no cont2");
		}
		}
		
	}
	
	
	
}

