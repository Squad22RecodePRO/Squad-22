package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UsuarioDAO;

@WebServlet("/excluir")
public class ExcluirUsuarioServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idUsuario = Integer.parseInt(req.getParameter("id"));
		
		UsuarioDAO udao = new UsuarioDAO();

		udao.removeById(idUsuario);

		resp.sendRedirect("home");
	}
}