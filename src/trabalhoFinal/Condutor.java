package trabalhoFinal;



import javax.swing.JOptionPane;

public class Condutor extends Pessoa {

	private String embriagado;
	
	public Condutor() {

	}

	public Condutor(String nome, int idade, char sexo, String embriagado) {
		super(nome, idade, sexo);
		this.embriagado = embriagado;
	}
	
	@Override
	public void cadastra() {
		super.cadastra();
			setEmbriagado(JOptionPane.showInputDialog("Embriagado? (S/N)").toUpperCase().charAt(0));
	}
	
	public String condutoresEmbriagados() {
		String dados = "";
		if (getEmbriagado().equals('S')) {
			
		}
		return dados;
	}
	
	
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " - " + getIdade() + " anos - " + getSexo() + " - Embriagado(a): " + getEmbriagado();
	}

	public String isEmbriagado() {
		return embriagado;
	}

	public void setEmbriagado(String embriagado) {
		this.embriagado = embriagado;
	}
	
}
