package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Genero;
import model.GeneroDAO;

/**
 * Servlet implementation class InserirGeneroServlet
 */
@WebServlet("/InserirGenero")
public class InserirGeneroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String genero = request.getParameter("genero");		
		 
		Genero objGenero =  new Genero();
	
		objGenero.setGenero(genero);
		
		GeneroDAO gdao = new GeneroDAO();		
		gdao.save(objGenero);
		
		response.sendRedirect("listarGenero");
		
		
		
	}

}
