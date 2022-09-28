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

import model.Genero;
import model.GeneroDAO;

/**
 * Servlet implementation class ListarGeneroServlet
 */
@WebServlet("/listarGenero")
public class ListarGeneroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Genero> agenda = new ArrayList<Genero>();
		GeneroDAO gdao = new GeneroDAO();		
		agenda = gdao.getGenero();		
		req.setAttribute("listaGenero", agenda);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("CadastrarGenero.jsp");
		dispatcher.forward(req, resp);
	}

}