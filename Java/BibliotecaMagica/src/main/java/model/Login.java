package model;

public class Login {
	private int id;
	private String login;
	private String senha;
	
	private Usuario usuario;
	
	public Login() {
	
	}
	public Login(int id, String login, String senha, Usuario usuario) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.usuario = usuario;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
