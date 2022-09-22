package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Login;
import model.LoginDAO;
import model.Usuario;

/**
 * Servlet implementation class InserirLoginServlet
 */
@WebServlet("/InserirLogin")
public class InserirLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		int idUsuario = Integer.parseInt(request.getParameter("usuario"));
		
		Login login1 = new Login();
		Usuario usuario1 = new Usuario();
				
		login1.setLogin(login);
		login1.setSenha(senha);
		login1.setUsuario(usuario1);
		login1.getUsuario().setId(idUsuario);
				
		LoginDAO ldao = new LoginDAO();		
		ldao.save(login1);
		
		response.sendRedirect("homeLogin");
	}
}
