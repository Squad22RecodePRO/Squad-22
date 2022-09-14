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

import model.Usuario;
import model.UsuarioDAO;

@WebServlet("/home")
public class ListarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		UsuarioDAO usdao = new UsuarioDAO();		
		usuarios = usdao.getUsuario();		
		request.setAttribute("listaUsuarios", usuarios);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Cadastro.jsp");
		dispatcher.forward(request, response);
	}

	
}
