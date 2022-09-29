package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Permissao;
import model.Usuario;
import model.UsuarioDAO;

/**
 * Servlet implementation class AlterarUsuarioServlet
 */
@WebServlet("/editarUsuario")
public class AlterarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int idUsuario = Integer.parseInt(request.getParameter("id"));
		UsuarioDAO udao = new UsuarioDAO();
		Usuario usuarioSelecionado = udao.getUsuarioById(idUsuario);

		request.setAttribute("usuario", usuarioSelecionado);

		RequestDispatcher rd = request.getRequestDispatcher("/AlterarUsuario.jsp");

		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Usuario UsuarioAlterado = new Usuario();
		Permissao permissao = new Permissao();

		UsuarioAlterado.setNome(request.getParameter("nome"));
		UsuarioAlterado.setEmail(request.getParameter("email"));
		UsuarioAlterado.setDataNasc(request.getParameter("dataNasc"));
		UsuarioAlterado.setPermissao(permissao);
		UsuarioAlterado.getPermissao().setId(Integer.parseInt(request.getParameter("permissao")));
			
		UsuarioAlterado.setId(Integer.parseInt(request.getParameter("id")));

		UsuarioDAO usd = new UsuarioDAO();
		usd.update(UsuarioAlterado);
		response.sendRedirect("listarUsuario");

	}

}
