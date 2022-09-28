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

		String sql = "INSERT INTO Usuario (Nome, Email, Data_nasc, Id_permissao)" + " VALUES(?,?,?,?)";

		try {
		
			conn = conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, usuario.getNome());
			
			pstm.setString(2, usuario.getEmail());			
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			pstm.setDate(3, new Date(dateFormat.parse(usuario.getDataNasc()).getTime()));
			
			pstm.setInt(4, usuario.getPermissao().getId());
		
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

		String sql = "UPDATE Usuario SET Nome = ?, Email = ?, Data_nasc = ?, Id_permissao = ?" + " WHERE Id_usuario = ?";

		try {
			conn = conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, usuario.getNome());
			
			pstm.setString(2, usuario.getEmail());
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			pstm.setDate(3, new Date(dateFormat.parse(usuario.getDataNasc()).getTime()));
			
			pstm.setInt(4, usuario.getPermissao().getId());

			pstm.setInt(5, usuario.getId());
			
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
				Permissao permissao = new Permissao();
				
				usuario.setPermissao(permissao);

				usuario.setId(rset.getInt("Id_usuario"));

				usuario.setNome(rset.getString("Nome"));

				usuario.setEmail(rset.getString("Email"));

				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				usuario.setDataNasc(dateFormat.format(rset.getDate("Data_nasc")));
				
				usuario.getPermissao().setId((rset.getInt("Id_permissao")));

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
		Permissao permissao = new Permissao();

		ResultSet rset = null;

		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			rset = pstm.executeQuery();

			rset.next();
			
			usuario.setPermissao(permissao);

			usuario.setNome(rset.getString("Nome"));
			usuario.setEmail(rset.getString("Email"));
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			usuario.setDataNasc(dateFormat.format(rset.getDate("Data_nasc")));
			usuario.getPermissao().setId((rset.getInt("Id_permissao")));
			usuario.setId(rset.getInt("Id_usuario"));

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


