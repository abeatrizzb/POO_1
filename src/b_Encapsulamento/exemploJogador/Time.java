package b_Encapsulamento.exemploJogador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Time {

	private String nome;
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	public void cadastrar() {
		setNome(JOptionPane.showInputDialog("Nome do time:"));
		String continua = "";
		do {
			Jogador j = new Jogador();
			j.cadastrar();
			jogadores.add(j);
			continua = JOptionPane.showInputDialog("Mais jogadores? S/N");
			
		}while(continua.equalsIgnoreCase("S"));
	}
	public String exibir() {
		String dados = "Time: *"+getNome()+ "*\n";
		for (Jogador j: jogadores) {
			dados+= j.exibir();
		}
		return dados;
	}
	public Jogador artilheiroTime() {
		Jogador art = jogadores.get(0);
		for (Jogador j : jogadores) {
			if (j.getGols() > art.getGols()) {
				art = j;
			}
		}
		return art;
	}
	public int getGolsTime() {
		int gols = 0;
			for (Jogador j : jogadores) {
				gols += j.getGols();
				
			}	
		return gols;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
