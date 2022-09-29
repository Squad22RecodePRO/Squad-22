package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Permissao;
import model.PermissaoDAO;

/**
 * Servlet implementation class AlterarPermissaoServlet
 */
@WebServlet("/editarPermisssao")
public class AlterarPermissaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idPermissao = Integer.parseInt(req.getParameter("id"));
		PermissaoDAO pdao = new PermissaoDAO();
		Permissao permissaoSelecionada = pdao.getPermissaoById(idPermissao);

		req.setAttribute("permissao", permissaoSelecionada);

		RequestDispatcher rd = req.getRequestDispatcher("/AlterarPermissao.jsp");

		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Permissao permissaoAlterada = new Permissao();
		
		permissaoAlterada.setTipo(req.getParameter("permissao"));
		permissaoAlterada.setId(Integer.parseInt(req.getParameter("id")));

		PermissaoDAO pd = new PermissaoDAO();
		pd.update(permissaoAlterada);
		resp.sendRedirect("listarPermissao");
	}

}
