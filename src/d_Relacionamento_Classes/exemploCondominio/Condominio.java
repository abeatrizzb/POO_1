package d_Relacionamento_Classes.exemploCondominio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Condominio {

	private List<Apartamento> apartamentos;
	private List<Despesas> despesas;
	
	public Condominio() {
		this.apartamentos = new ArrayList<>();
		this.despesas = new ArrayList<>();
	}
	
	public void cadastrarApartamento() {
		Apartamento ap = new Apartamento();
		ap.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero do ap.: ")));
		ap.setBloco(JOptionPane.showInputDialog("Bloco do ap.: "));
		ap.setTamanho(Double.parseDouble(JOptionPane.showInputDialog("Tamanho em metro quadrado: ")));
		ap.setNomeProprietario(JOptionPane.showInputDialog("Nome do proprietário: "));
		apartamentos.add(ap);
	}
	public void cadastrarDespesa() {
		Despesas d = new Despesas();
		d.setDescricao(JOptionPane.showInputDialog("Descrição da despesa: "));
		d.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano da despesa: ")));
		d.setMes(Integer.parseInt(JOptionPane.showInputDialog("Mês da despesa: ")));
		d.setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor da despesa (R$): ")));
		despesas.add(d);
	}
	public void valorDevidoPorProprietario() {
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Despesas de qual ano?"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Despesas de qual mês?"));
		
		String valoresDevidos = "Total devido por proprietário: \n\n";
		
		for (Apartamento ap : apartamentos) {
			double valorApartamento = ap.calculaValorApartamento();
			double valorDespesas = calcularTotalDespesaPorApartamento(ano, mes);
			double valorTotal = valorApartamento + valorDespesas;
			valoresDevidos +=  "Prop.: " + ap.getNomeProprietario() + " | R$: " + valorTotal + "\n";
		}
		
		JOptionPane.showMessageDialog(null, valoresDevidos);
	}
	
	private double calcularTotalDespesaPorApartamento(int ano, int mes) {
		double valorTotalDespesas = 0.0;
		for (Despesas d : despesas) {
			if (d.getAno() == ano && d.getMes() == mes) {
				valorTotalDespesas += d.getValor() / apartamentos.size();
			}
		}
		return valorTotalDespesas;
	}
	
	private String extratoDespesaPorApartamento(int ano, int mes) {
		String extratoDespesas = "";
		for (Despesas d : despesas) {
			if (d.getAno() == ano && d.getMes() == mes) {
				double valorDespesa = d.getValor() / apartamentos.size();
				extratoDespesas += d.getDescricao() + " - R$: " + valorDespesa + "\n";
			}
		}
		return extratoDespesas;
	}
	
	public void extratoDespesaTotalPorApartamento() {
		String listaApartamentos = "";
		for (Apartamento ap : apartamentos) {
			listaApartamentos += ap.getNumero() + " - " + ap.getNomeProprietario() + "\n";
		}
		
		int numeroApartamento = Integer.parseInt(JOptionPane.showInputDialog("Numero do ap.:\n" + listaApartamentos));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Despesas de qual ano?"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Despesas de qual mês?"));
		String extrato = "Extrato do apartamento: " + numeroApartamento + "\n";
		for (Apartamento ap : apartamentos) {
			if(ap.getNumero() == numeroApartamento){
				double valorApartamento = ap.calculaValorApartamento();
				double valorTotal = valorApartamento + calcularTotalDespesaPorApartamento(ano, mes);
				extrato += "Despesas: \n" 
						+ extratoDespesaPorApartamento(ano, mes)
						+ "CONDOMINIO | R$: " + valorApartamento
						+ "\n\nValor total R$: " + valorTotal;
			}
		}
		JOptionPane.showMessageDialog(null, extrato);
	}
	
	public List<Apartamento> getApartamentos() {
		return apartamentos;
	}
	public void setApartamentos(List<Apartamento> apartamentos) {
		this.apartamentos = apartamentos;
	}
	public List<Despesas> getDespesas() {
		return despesas;
	}
	public void setDespesas(List<Despesas> despesas) {
		this.despesas = despesas;
	}
	
}
