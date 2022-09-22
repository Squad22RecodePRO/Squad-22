package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PermissaoDAO {

	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Permissao permissao) {

		String sql = "INSERT INTO Permissao (Tipo)" + " VALUES(?)";

		try {
		
			conn = conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, permissao.getTipo());
						
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
		String sql = "DELETE FROM Permissao WHERE Id_permissao = ?";

		try {
			conn = conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void update(Permissao permissao) {

		String sql = "UPDATE Permissao SET Tipo = ?" + " WHERE Id_permissao = ?";

		try {
			conn = conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, permissao.getTipo());
			
			pstm.setInt(2, permissao.getId());
			
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

	public List<Permissao> getPermissao() {

		String sql = "SELECT * FROM Permissao";

		List<Permissao> permissoes = new ArrayList<Permissao>();

		ResultSet rset = null;

		try {
			conn = conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {

				Permissao permissao = new Permissao();

				permissao.setId(rset.getInt("id"));

				permissao.setTipo(rset.getString("tipo"));

				permissoes.add(permissao);
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

		return permissoes;
	}

	public Permissao getPermissaoById(int id) {

		String sql = "SELECT * FROM Permissao where Id_permissao = ?";
		Permissao permissao = new Permissao();

		ResultSet rset = null;

		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			rset = pstm.executeQuery();

			rset.next();

			permissao.setTipo(rset.getString("tipo"));
			permissao.setId(rset.getInt("id"));

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
		return permissao;
	}
}



