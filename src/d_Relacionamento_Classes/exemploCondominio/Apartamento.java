package d_Relacionamento_Classes.exemploCondominio;

public class Apartamento {

	private int numero;
	private String bloco;
	private double tamanho;
	private String nomeProprietario;
	private static final double valorMetroQuadrado = 5.0;

	public double calculaValorApartamento() {
		return tamanho * valorMetroQuadrado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProp) {
		this.nomeProprietario = nomeProp;
	}

	
	
	
}
