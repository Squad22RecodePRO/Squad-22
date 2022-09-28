package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Genero;
import model.GeneroDAO;
/**
 * Servlet implementation class AlterarGeneroServlet
 */
@WebServlet("/editarGenero")
public class AlterarGeneroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idGenero = Integer.parseInt(req.getParameter("id_genero"));
		GeneroDAO gdao = new GeneroDAO();
		Genero generoSelecionado = gdao.getgeneroById(idGenero);

		req.setAttribute("genero", generoSelecionado);
	
		RequestDispatcher rd = req.getRequestDispatcher("/AlterarGenero.jsp");

        rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Genero generoAlterado = new Genero();		
		generoAlterado.setGenero(req.getParameter("genero"));
		
		generoAlterado.setId_genero(Integer.parseInt(req.getParameter("id_genero")));
		
		GeneroDAO gd = new GeneroDAO();
		gd.update(generoAlterado);	
		resp.sendRedirect("listarGenero");
	}

}
