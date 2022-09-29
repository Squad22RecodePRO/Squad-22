package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Permissao;
import model.PermissaoDAO;

/**
 * Servlet implementation class ListarPermissaoServlet
 */
@WebServlet("/listarPermissao")
public class ListarPermissaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Permissao> permissao = new ArrayList<Permissao>();
		PermissaoDAO pdao = new PermissaoDAO();		
		permissao = pdao.getPermissao();		
		request.setAttribute("listaPermissoes", permissao);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("CadastrarPermissao.jsp");
		dispatcher.forward(request, response);
	}

}
