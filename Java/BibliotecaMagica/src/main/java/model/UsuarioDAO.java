package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Usuario usuario) {

		String sql = "INSERT INTO Usuario (Nome, Email, Data_nasc)" + " VALUES(?,?,?)";

		try {
		
			conn = conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, usuario.getNome());
			
			pstm.setString(2, usuario.getEmail());			
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			pstm.setDate(3, new Date(dateFormat.parse(usuario.getDataNasc()).getTime()));
		
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
		String sql = "DELETE FROM Usuario WHERE Id_usuario = ?";

		try {
			conn = conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void update(Usuario usuario) {

		String sql = "UPDATE Usuario SET Nome = ?, Email = ?, Data_nasc = ?" + " WHERE Id_usuario = ?";

		try {
			conn = conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, usuario.getNome());
			
			pstm.setString(2, usuario.getEmail());
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			pstm.setDate(3, new Date(dateFormat.parse(usuario.getDataNasc()).getTime()));

			pstm.setInt(4, usuario.getId());
			
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

	public List<Usuario> getUsuario() {

		String sql = "SELECT * FROM Usuario";

		List<Usuario> usuarios = new ArrayList<Usuario>();

		ResultSet rset = null;

		try {
			conn = conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {

				Usuario usuario = new Usuario();

				usuario.setId(rset.getInt("id"));

				usuario.setNome(rset.getString("nome"));

				usuario.setEmail(rset.getString("email"));

				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				usuario.setDataNasc(dateFormat.format(rset.getDate("dataNasc")));

				usuarios.add(usuario);
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

		return usuarios;
	}

	public Usuario getUsuarioById(int id) {

		String sql = "SELECT * FROM Usuario where Id_usuario = ?";
		Usuario usuario = new Usuario();

		ResultSet rset = null;

		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			rset = pstm.executeQuery();

			rset.next();

			usuario.setNome(rset.getString("nome"));
			usuario.setEmail(rset.getString("email"));
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			usuario.setDataNasc(dateFormat.format(rset.getDate("dataNasc")));
			usuario.setId(rset.getInt("id"));

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
		return usuario;
	}
}


