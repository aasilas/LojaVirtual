package br.ucsal.loja.categorias;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SubmitNameServlet")
public class Produto extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6793105300356800648L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String name2 = req.getParameter("name2");
		String name3 = req.getParameter("name3");
		
		PrintWriter out = new PrintWriter(resp.getOutputStream());
		out.println("<h1> Calça: " + name + "</h1>");
		out.println("<h1> Camisa: " + name2 + "</h1>");
		out.println("<h1> Tênis: " + name3 + "</h1>");
		out.close();
	}
}
 	