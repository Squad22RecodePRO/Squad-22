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

import model.Login;
import model.LoginDAO;

@WebServlet("/listarLogin")
public class ListarLoginServlet extends HttpServlet {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Login> logins = new ArrayList<Login>();
		LoginDAO ldao = new LoginDAO();
		logins = ldao.getLogin();
		request.setAttribute("listaLogins", logins);

		RequestDispatcher dispatcher = request.getRequestDispatcher("CadastrarLogin.jsp");
		dispatcher.forward(request, response);
	}

}
