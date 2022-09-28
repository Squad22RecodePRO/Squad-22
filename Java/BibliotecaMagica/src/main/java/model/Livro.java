package model;

public class Livro {

	private int Id_livro;
	private String autor;
	private String titulo;

	private Genero genero;

	public Livro() {

	}

	public Livro(int id_livro, String autor, String titulo, Genero genero) {

		Id_livro = id_livro;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
	}

	public int getId_livro() {
		return Id_livro;
	}

	public void setId_livro(int id_livro) {
		Id_livro = id_livro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}
