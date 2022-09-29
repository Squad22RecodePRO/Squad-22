package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginDAO;

/**
 * Servlet implementation class EscluirLoginServlet
 */
@WebServlet("/excluirLogin")
public class ExcluirLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idLogin = Integer.parseInt(req.getParameter("id"));
		
		LoginDAO ldao = new LoginDAO();

		ldao.removeById(idLogin);

		resp.sendRedirect("listarLogin");
	}
}
