package SistemaSmartTv;
import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		Scanner scan = new Scanner(System.in);
		
		String liga;
		String altVolume;
		
		System.out.println("Ligar TV ?");
		
		liga = scan.next();
		
		if(liga.equals("sim")) {
		
		smartTv.ligar();
		
		System.out.println(smartTv.ligada?"Está ligada":"Está desligada");
		
		}else {
			
			System.out.println("TV não ligada");
			return;
			
		}
		
		System.out.println("Alterar Volume ?");
		altVolume = scan.next();
		
		if(altVolume.equals("sim")) {
		
		int maisVol;
		int menosVol;
		String maisOuMenos;
		
		System.out.println("Aumentar ou diminuir ?");
		maisOuMenos = scan.next();
		
		if(maisOuMenos.equals("aumentar")) {
		System.out.println("Aumentar quanto ?");
		maisVol = scan.nextInt();
			
		for (int qtd = smartTv.volume; qtd < maisVol; qtd++) {
			
			smartTv.aumentarVolume();
			System.out.println("Volume "+smartTv.volume);
			
		}
		
		System.out.println("Volume aumentou para: "+smartTv.volume);
		
		}else if (maisOuMenos.equals("diminuir")) {
			System.out.println("Diminuir quanto ?");
			menosVol = scan.nextInt();
			
			for(int qtd = smartTv.volume; qtd > menosVol; qtd--) {
				
				smartTv.diminuirVolume();
				System.out.println(smartTv.volume);
				
			}
			System.out.println("Volume diminuiu para: "+smartTv.volume);
		}
		
		
		}
			
			String alteraCanal;
			
			System.out.println("Deseja alterar o canal ?");
			alteraCanal = scan.next();
			
			if("sim".equals(alteraCanal)) {
				
				int metodoBuscaCanal;
				System.out.println("Canal por canal press 1 ou ir direto press 2?");
				metodoBuscaCanal = scan.nextInt();
				
				if (metodoBuscaCanal == 1) {
					
					smartTv.aumentarCanal();
					System.out.println(smartTv.canal);
					
				} else {
				
				int canal;
				System.out.println("Qual canal você deseja ?");
				canal = scan.nextInt();
				smartTv.canal = canal;
				System.out.println("Canal atual >> " + smartTv.canal);
			
				}
			
			} else if ("não".equals(alteraCanal)) {
				
				System.out.println("Canal atual >> " + smartTv.canal);
				
			}
		
	}

}
