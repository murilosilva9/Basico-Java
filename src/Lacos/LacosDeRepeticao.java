package Lacos;

public class LacosDeRepeticao {

	public static void main(String[] args) {

		Metodos met = new Metodos();
		
		met.metodo1();
		System.out.println("proximo metodo");
		met.metodo2();
				
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

