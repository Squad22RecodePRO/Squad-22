package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Livro livro) {
		
		String sql = "INSERT INTO Livro (Autor, Titulo, Id_genero)" + " VALUES(?,?,?)";

		try {
		
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, livro.getAutor());
			
			pstm.setString(2, livro.getTitulo());			
			
			pstm.setInt(3, livro.getGenero().getId_genero());			
			
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
		String sql = "DELETE FROM Livro WHERE Id_livro = ?";

		try {
			conn = conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(Livro livro) {

		String sql = "UPDATE Livro SET Autor = ?, Titulo = ?, Id_genero = ?" + " WHERE Id_livro = ?";

		try {
			conn = conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1,livro.getAutor());
			
			pstm.setString(2, livro.getTitulo());
			
			pstm.setInt(3, livro.getGenero().getId_genero());
		
			pstm.setInt(4, livro.getId_livro());
			
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

	public List<Livro> getLivros() {

		String sql = "select * from livro_completo;";

		List<Livro> livros = new ArrayList<Livro>();

		ResultSet rset = null;

		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {

				Livro livro = new Livro();
				Genero genero = new Genero();
				
				genero.setGenero(rset.getString("genero"));
				
				livro.setGenero(genero);

				livro.setId_livro((rset.getInt("id_livro")));
	
				livro.setAutor((rset.getString("Autor")));

				livro.setTitulo((rset.getString("Titulo")));
				
				livro.getGenero().setId_genero((rset.getInt("Id_genero")));

				livros.add(livro);
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

		return livros;
	}

	public Livro getLivroById(int id) {

		String sql = "select * from livro_completo where Id_livro = ?";
		Livro livro = new Livro();
		Genero genero = new Genero();

		ResultSet rset = null;

		try {
			conn = conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			rset = pstm.executeQuery();

			rset.next();
			
			genero.setGenero(rset.getString("genero"));
			
			livro.setGenero(genero);

			livro.setAutor((rset.getString("Autor")));
			
			livro.setTitulo((rset.getString("Titulo")));
			
			livro.setId_livro((rset.getInt("id_livro")));
			
			livro.getGenero().setId_genero((rset.getInt("id_genero")));
			

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
		return livro;
	}

}

