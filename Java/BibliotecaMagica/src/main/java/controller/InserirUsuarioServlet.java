package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import model.UsuarioDAO;

@WebServlet("/InserirUsuario")
public class InserirUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String dataNasc = request.getParameter("dataNasc");
		int permissao = Integer.parseInt(request.getParameter("permissao"));
		
		Usuario usuarioObj = new Usuario();
				
		usuarioObj.setNome(nome);
		usuarioObj.setEmail(email);		
		usuarioObj.setDataNasc(dataNasc);	
		usuarioObj.getPermissao().setId(permissao);
				
		UsuarioDAO udao = new UsuarioDAO();		
		udao.save(usuarioObj);
		
		response.sendRedirect("listarUsuario");
	}
}
	