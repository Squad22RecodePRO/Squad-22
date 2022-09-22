package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Genero;
import model.Livro;
import model.LivroDAO;
/**
 * Servlet implementation class AlterarLivroServlet
 */
@WebServlet("/editarlivro")
public class AlterarLivroServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			int idLivro = Integer.parseInt(req.getParameter("id_livro"));
			LivroDAO ldao = new LivroDAO();
			Livro livroSelecionado = ldao.getLivroById(idLivro);

			req.setAttribute("livro", livroSelecionado);
		
			RequestDispatcher rd = req.getRequestDispatcher("/AlterarLivro.jsp");

	        rd.forward(req, resp);
		}

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			Livro livroAlterado = new Livro();
			Genero genero = new Genero();
			
			livroAlterado.setTitulo(req.getParameter("titulo"));
			livroAlterado.setAutor(req.getParameter("autor"));
			livroAlterado.setGenero(genero);
			livroAlterado.getGenero().setId_genero(Integer.parseInt(req.getParameter("id_genero")));
			livroAlterado.setId_livro(Integer.parseInt(req.getParameter("id_livro")));
						
			LivroDAO ld = new LivroDAO();
			ld.update(livroAlterado);	
			resp.sendRedirect("home2");
		}

	}

