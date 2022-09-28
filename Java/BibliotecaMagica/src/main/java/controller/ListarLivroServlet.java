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

import model.Livro;
import model.LivroDAO;

/**
 * Servlet implementation class ListarLivroServlet
 */
@WebServlet("/listarLivro")
public class ListarLivroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Livro> agenda = new ArrayList<Livro>();
		LivroDAO ldao = new LivroDAO();		
		agenda = ldao.getLivros();		
		req.setAttribute("listaLivro", agenda);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("CadastrarLivro.jsp");
		dispatcher.forward(req, resp);
	}

}