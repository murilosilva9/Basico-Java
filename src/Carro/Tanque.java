package Carro;

public class Tanque {
	
	int capacidadeEmLitros = 50;
	float preco;
	float percDescHoje;
	
	
	public float getPercDescHoje() {
		return percDescHoje;
	}

	public void setPercDescHoje(float percDescHoje) {
		this.percDescHoje = percDescHoje;
	}

	public float getTotalAbastecimento() {
		return totalAbastecimento;
	}

	public void setTotalAbastecimento(float totalAbastecimento) {
		this.totalAbastecimento = totalAbastecimento;
	}

	float totalAbastecimento;
	
	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float calcularTanqueCheio(float preco) {
		float custoTotal = 0;
		
		custoTotal = preco * capacidadeEmLitros;
		
		return custoTotal;
	}
	
	public float calcularTanqueCheio(float preco, float percDesc) {
		
		float custoTotal = 0;
		
		custoTotal = (preco * capacidadeEmLitros)*(1-(percDesc/100));
		
		return custoTotal;
	}

}
