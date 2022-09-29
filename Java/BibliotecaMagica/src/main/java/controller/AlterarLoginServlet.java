package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Login;
import model.LoginDAO;
import model.Usuario;

/**
 * Servlet implementation class AlterarLoginServlet
 */
@WebServlet("/editarLogin")
public class AlterarLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int idLogin = Integer.parseInt(request.getParameter("id"));
		LoginDAO ldao = new LoginDAO();
		Login loginSelecionado = ldao.getLoginById(idLogin);

		request.setAttribute("login", loginSelecionado);

		RequestDispatcher rd = request.getRequestDispatcher("/AlterarLogin.jsp");

		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Login LoginAlterado = new Login();
		Usuario usuario = new Usuario();

		LoginAlterado.setLogin(request.getParameter("login"));
		LoginAlterado.setSenha(request.getParameter("senha"));
		LoginAlterado.setUsuario(usuario);
		LoginAlterado.getUsuario().setId(Integer.parseInt(request.getParameter("usuario")));

		LoginAlterado.setId(Integer.parseInt(request.getParameter("id")));

		LoginDAO lsd = new LoginDAO();
		lsd.update(LoginAlterado);
		response.sendRedirect("listarLogin");

	}

}
