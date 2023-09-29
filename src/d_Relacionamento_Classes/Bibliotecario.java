package d_Relacionamento_Classes;

import java.util.ArrayList;

public class Bibliotecario {

	private String nome;
	private Livro livro;
	ArrayList<Livro> livros = new ArrayList<>();
	
	public void cadastraLivro(String titulo, String autor) {		
		Livro l = new Livro();
		livros.add(l);
	}
	
	public Bibliotecario() {
		this.livro = new Livro();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
