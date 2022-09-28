package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LivroDAO;

/**
 * Servlet implementation class ExcluirLivroServlet
 */
@WebServlet("/excluirLivro")
public class ExcluirLivroServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idLivro = Integer.parseInt(req.getParameter("id_livro"));

		LivroDAO ldao = new LivroDAO();

		ldao.removeById(idLivro);

		resp.sendRedirect("listarLivro");
	}

}
