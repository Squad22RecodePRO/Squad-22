package model;

public class Genero {

	private int Id_genero;
	private String Genero;
		
	public Genero() {
		
	}
	
	public Genero(int id_genero, String genero) {		
		Id_genero = id_genero;
		Genero = genero;
	}	
	
	public int getId_genero() {
		return Id_genero;
	}
	
	public void setId_genero(int id_genero) {
		Id_genero = id_genero;
	}
	
	public String getGenero() {
		return Genero;
	}
	
	public void setGenero(String genero) {
		Genero = genero;
	}
}
