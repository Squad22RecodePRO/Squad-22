package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Permissao;
import model.PermissaoDAO;

/**
 * Servlet implementation class InserirPermissaoServlet
 */
@WebServlet("/InserirPermissao")
public class InserirPermissaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipo = request.getParameter("tipo");
				
		Permissao permissao = new Permissao();
				
		permissao.setTipo(tipo);		
				
		PermissaoDAO pdao = new PermissaoDAO();		
		pdao.save(permissao);
		
		response.sendRedirect("listarPermissao");
	}

}
