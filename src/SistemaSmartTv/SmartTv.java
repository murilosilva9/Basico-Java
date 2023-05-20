package SistemaSmartTv;

public class SmartTv {
		
	boolean ligada;
	int volume = 10;
	int canal = 0;
	

	public void ligar() {
		
		ligada = true;
		
	}
	
	public void desligar() {
		
		ligada = false;
		
	}
	
	public void aumentarVolume() {
		
		volume++;
	}
	
	public void diminuirVolume() {
		
		volume--;
	}
	
	public void aumentarCanal() {
		
		canal++;
	}
	
}
