package d_Relacionamento_Classes.exemploCondominio;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Condominio cond = new Condominio();

		String menu = "1- Cadastrar apartamento\n" + "2- Cadastrar despesa\n" + "3- Valor devido por proprietário\n"
				+ "4- Valor devido do apartamento\n" + "5- Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cond.cadastrarApartamento();
				break;
			case 2:
				cond.cadastrarDespesa();
				break;
			case 3:
				cond.valorDevidoPorProprietario();
				break;
			case 4:
				cond.extratoDespesaTotalPorApartamento();
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Sair");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida!");
			}
		} while (op != 5);
	}
}
