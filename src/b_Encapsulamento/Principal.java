package b_Encapsulamento;

public class Principal {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		
		p.setNome("Ana");
		p.setIdade(10);
	
		System.out.println(p.getNome() + ": " + p.getIdade());
	}

}
