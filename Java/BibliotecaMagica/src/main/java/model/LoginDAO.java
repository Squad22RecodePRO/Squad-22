package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {

	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Login login) {

		String sql = "INSERT INTO Login (Login, Senha, Id_usuario)" + " VALUES(?,?,?)";

		try {
		
			conn = conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, login.getLogin());
			
			pstm.setString(2, login.getSenha());			
						
			pstm.setInt(3, login.getUsuario().getId());
		
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	public void removeById(int id) {
		String sql = "DELETE FROM Login WHERE Id_login = ?";

		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(Login login) {

		String sql = "UPDATE Login SET Login = ?, Senha = ?, Id_usuario = ?" + " WHERE Id_login = ?";

		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, login.getLogin());
			
			pstm.setString(2, login.getSenha());
						
			pstm.setInt(3, login.getUsuario().getId());

			pstm.setInt(4, login.getId());
			
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Login> getLogin() {

		String sql = "SELECT * FROM login_completo";

		List<Login> logins = new ArrayList<Login>();

		ResultSet rset = null;

		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {

				Login login = new Login();
				Usuario usuario = new Usuario();
				
				login.setUsuario(usuario);

				login.setId(rset.getInt("Id_login"));

				login.setLogin(rset.getString("Login"));

				login.setSenha(rset.getString("Senha"));
				
				login.getUsuario().setId((rset.getInt("Id_usuario")));
				
				login.getUsuario().setEmail((rset.getString("Email")));

				logins.add(login);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {

			try {

				if (rset != null) {
					rset.close();
				}

				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return logins;
	}

	public Login getLoginById(int id) {

		String sql = "SELECT * FROM login_completo where Id_login = ?";
		Login login = new Login();
		Usuario usuario = new Usuario();
		
		ResultSet rset = null;

		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			rset = pstm.executeQuery();

			rset.next();

			login.setUsuario(usuario);
			
			login.setLogin(rset.getString("Login"));
			login.setSenha(rset.getString("Senha"));
			login.getUsuario().setId((rset.getInt("Id_usuario")));
			login.getUsuario().setEmail((rset.getString("Email")));
			login.setId(rset.getInt("Id_login"));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return login;
	}
}
