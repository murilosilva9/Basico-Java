package tiposVariaveis;

public class TiposDeVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salarioMinimo = 6000.99;
		int ano = 2023;
		short mes = 01;
		float pi = 3.14F;
		long cep = 38425354L;
		int cast = 2147483647;
		
		mes = (short) cast;
		
		System.out.println(mes); // vai dar -1 pois deu overflow no mes que é short
		
		// teste de pull do git para o eclipse

	}

}
