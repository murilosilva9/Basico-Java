package Carro;

import java.util.Scanner;

public class Carro {

	public static void main(String[] args) {
		
		Tanque tanque = new Tanque();
		
		Scanner scan = new Scanner(System.in);
		
		float percDesc;
		float precoHoje;
		float custoTotBruto;
		float custoTotLiq;
		
		System.out.println("Qual percentual de desconto?");
		
		percDesc = scan.nextFloat();
		
		tanque.setPercDescHoje(percDesc);
		
		System.out.println("Qual preço do combustível?");
		
		precoHoje = scan.nextFloat();
		
		tanque.setPreco(precoHoje);
		
		custoTotBruto = tanque.calcularTanqueCheio(tanque.getPreco());
		custoTotLiq = tanque.calcularTanqueCheio(tanque.getPreco(),tanque.getPercDescHoje());
		
		System.out.println("Valor total do tanque cheio Sem desc. = R$"+custoTotBruto);
		System.out.println("Valor total do tanque cheio Com desc. = R$"+custoTotLiq);
		
		
		
	}

}
