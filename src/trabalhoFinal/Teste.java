package trabalhoFinal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		List<Veiculo> veiculos = new ArrayList<>();
		List<Rodovia> rodovias = new ArrayList<>();
		List<Acidente> acidentes = new ArrayList<>();

		String menu = "1 - Cadastrar rodovia\n" + "2 - Cadastrar acidente\n"
				+ "3 - Listar acidentes com condutor embriagado\n"
				+ "4 - Mostrar a quantidade de acidentes para cada nível de periculosidade\n"
				+ "5 - Mostrar veículos de carga que se envolveram em acidentes\n"
				+ "6 - Rodovia em que ocorreram mais acidentes com bicicletas\n"
				+ "7 - Rodovia que possui mais acidentes com vítimas fatais\n"
				+ "8 - Quantos acidentes possuem veículos novos\n"
				+ "9 - rodovias que registraram acidentes no carnaval \n"
				+ "10 - Sair";
		Pessoa p = new Pessoa();
		Rodovia r = new Rodovia();
		Veiculo v = new Veiculo();
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if (op == 1) {
				r.cadastra();
				rodovias.add(r);
			}
			if (op == 2) {
				int qtdVeiculos = Integer
						.parseInt(JOptionPane.showInputDialog("Informe a quantidade de veículos envolvidos"));
				for (int i = 0; i < qtdVeiculos; i++) {
					JOptionPane.showMessageDialog(null, "Cadastrar veículo " + (i + 1));
					
					v.cadastra();
					veiculos.add(v);
					int qtdPessoas = Integer
							.parseInt(JOptionPane.showInputDialog("Informe a quantidade de pessoas no veículo"));
					for (int j = 0; j < qtdPessoas; j++) {
						JOptionPane.showMessageDialog(null, "Cadastrar pessoa " + (j + 1));
						p.cadastra();
						pessoas.add(p);
					}
				}
				Acidente a = new Acidente();
				JOptionPane.showMessageDialog(null, "Informe a rodovia ->");
				r.cadastra();
				rodovias.add(r);
				a.cadastra();
				acidentes.add(a);
			}
			if (op == 3) {
				JOptionPane.showMessageDialog(null, p.listaCondutor(pessoas));
			}
			if (op == 4) {
			
				r.pAlto(rodovias);
				r.pMedio(rodovias);
				r.pBaixo(rodovias);
				JOptionPane.showMessageDialog(null, "Alto: " + r.pAlto(rodovias) + "\nMédio: " + r.pMedio(rodovias)
						+ "\nBaixo: " + r.pBaixo(rodovias));
			}
			if (op == 5) {
			JOptionPane.showMessageDialog(null, v.acidenteVCarga(veiculos));
			}
			
			
		} while (op != 10);

	}

}
