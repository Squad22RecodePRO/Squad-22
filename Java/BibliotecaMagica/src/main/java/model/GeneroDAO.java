package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GeneroDAO {
	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Genero genero) {

		String sql = "INSERT INTO Genero (Genero)" + " VALUES(?)";

		try {
		
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, genero.getGenero());
		
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
		String sql = "DELETE FROM Genero WHERE Id_genero = ?";

		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(Genero genero) {

		String sql = "UPDATE Genero SET Genero = ?" + " WHERE Id_genero = ?";

		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, genero.getGenero());
			
			pstm.setInt(2, genero.getId_genero());
			
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

	public List<Genero> getGenero() {

		String sql = "SELECT * FROM Genero";

		List<Genero> generos = new ArrayList<Genero>();

		ResultSet rset = null;

		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {

				Genero genero = new Genero();

				genero.setId_genero(rset.getInt("id_genero"));

				genero.setGenero(rset.getString("Genero"));

				generos.add(genero);
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

		return generos;
	}

	public Genero getgeneroById(int id) {

		String sql = "SELECT * FROM Genero where Id_genero = ? ";
		Genero genero = new Genero();

		ResultSet rset = null;

		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			rset = pstm.executeQuery();

			rset.next();

			genero.setId_genero(rset.getInt("Id_genero"));
			
			genero.setGenero(rset.getString("genero"));

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
		return genero;
	}
}
