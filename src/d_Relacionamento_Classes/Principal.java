package d_Relacionamento_Classes;

public class Principal {

	public static void main(String[] args) {

		Livro l = new Livro();
		
		l.emprestar("Ana");
		Bibliotecario b = new Bibliotecario();
		b.cadastraLivro("Morro dos ventos uivantes", "Ana");
	}

}
