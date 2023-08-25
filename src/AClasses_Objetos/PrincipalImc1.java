package AClasses_Objetos;

import javax.swing.JOptionPane;

public class PrincipalImc1 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de pessoas"));
		
		Pessoa pessoas[] = new Pessoa[n]; 
		
		String resultado = "";
		
		for (int i = 0; i<n; i++) {
			Pessoa p = new Pessoa(); 
			p.cadastro(); 
			pessoas[i] = p; 
			resultado += p.exibirDados(); 
			
		}
		
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	
}
