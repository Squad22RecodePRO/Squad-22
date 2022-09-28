package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GeneroDAO;

/**
 * Servlet implementation class ExcluirGeneroServlet
 */
@WebServlet("/excluirGenero")
public class ExcluirGeneroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idGenero = Integer.parseInt(req.getParameter("id_genero"));

		

		GeneroDAO gdao = new GeneroDAO();

		gdao.removeById(idGenero);

		resp.sendRedirect("listarGenero");
	}

}
