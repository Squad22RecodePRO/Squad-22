package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PermissaoDAO;

/**
 * Servlet implementation class ExcluirPermissaoServlet
 */
@WebServlet("/excluirPermissao")
public class ExcluirPermissaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int idPermissao = Integer.parseInt(req.getParameter("id"));		

		PermissaoDAO pdao = new PermissaoDAO();

		pdao.removeById(idPermissao);

		resp.sendRedirect("listarPermissao");
	}


}
