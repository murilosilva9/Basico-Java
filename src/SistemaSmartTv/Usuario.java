package SistemaSmartTv;
import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		smartTv.ligar();
		
		System.out.println(smartTv.ligada?"Está ligada":"Está desligada");
		
		//aumentar volume para 20
		for (int qtd = smartTv.volume; qtd < 20; qtd++) {
			
			smartTv.aumentarVolume();
			System.out.println("Volume "+smartTv.volume);
		}
		
		
		System.out.println("Volume aumentou para: "+smartTv.volume);
		
		
	}

}
