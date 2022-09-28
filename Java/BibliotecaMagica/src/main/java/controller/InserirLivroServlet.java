package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Genero;
import model.Livro;
import model.LivroDAO;

/**
 * Servlet implementation class InserirLivroServlet
 */
@WebServlet("/inserirLivro")
public class InserirLivroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		String autor = request.getParameter("autor");
		String titulo = request.getParameter("titulo");
		int id_genero = Integer.parseInt(request.getParameter("id_genero"));

		Livro objLivro = new Livro();
		Genero objgenero = new Genero();

		objLivro.setAutor(autor);
		objLivro.setTitulo(titulo);
		objLivro.setGenero(objgenero);
		objLivro.getGenero().setId_genero(id_genero);

		LivroDAO ldao = new LivroDAO();
		ldao.save(objLivro);

		response.sendRedirect("listarLivro");
	}
}
