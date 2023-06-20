package Polimorfismo;

public class RodarPolimorfismo {

	public static void main(String[] args) {

		ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
		
		int cont = 0;
		
		for(ClasseMae classe : classes) {
			
			classe.metodo1();
			
			for(int i=0; i < classes.length ;i++) {
				
				if (i == cont) {
				System.out.println("POSIÇÃO DO VETOR "+i);
				
				}
			}
			cont++;
		}
	}
}
