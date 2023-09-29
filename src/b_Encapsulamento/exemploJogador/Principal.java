package b_Encapsulamento.exemploJogador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Time> lista = new ArrayList<Time>();
		String menu = "1 - Cadastrar jogadores e times\n"
				+ "2 - Lista de jogadores\n"
				+ "3 - Artilheiros do campeonato\n"
				+ "4 - Time que fez mais gols\n"
				+ "5 - Sair";
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if(op == 1) {
				Time t = new Time();
				t.cadastrar();
				lista.add(t);
			} if (op==2) {
				String nome = JOptionPane.showInputDialog("Informe o nome do time para listar seus jogadores: \n");
				String result = "Lista de jogadores: \n";
				for (Time t: lista) {
					if (nome.equalsIgnoreCase(t.getNome())) {
						result += t.exibir();
					}
				}
				JOptionPane.showMessageDialog(null, result);
				
			} if (op == 3) {
				String art = "Artilheiros do campeonato: \n";
				for (Time t: lista) {
					t.artilheiroTime();
					art += t.artilheiroTime().exibir();
					
				}
				JOptionPane.showMessageDialog(null, art);
				
			}if (op==4) {
				Time timeMaisGols = null;
				int maximoGols = -1;

				for (Time t : lista) {
					int golsTime = t.getGolsTime();
					if (golsTime > maximoGols) {
						maximoGols = golsTime;
						timeMaisGols = t;
					}
				}
				if (timeMaisGols != null) {
					JOptionPane.showMessageDialog(null, "Time com mais gols: \n" + timeMaisGols.getNome()
							+ "Total de Gols: " + maximoGols);
				}
			}
			
		}while(op!=5);
	}
	
}
