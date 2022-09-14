package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuario {
	private int id;
	private String nome;
	private String email;
	private LocalDate dataNasc;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Usuario() {
	
	}
	
	public Usuario(int id, String nome, String email, String dataNasc) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dataNasc = LocalDate.parse(dataNasc, formatter);
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDataNasc() {
		return formatter.format(this.dataNasc);
	}
	
	public void setDataNasc(String dataNasc) {
		this.dataNasc = LocalDate.parse(dataNasc, formatter);;
	}
	
	

}
