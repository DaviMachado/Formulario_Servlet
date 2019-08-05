package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Cadastro Servlet", urlPatterns="/cadastro")
public class CadastroServlet extends HttpServlet {
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	    throws ServletException, IOException {
		
		// vamos indicar que a nossa resposta será em HTML ao invés de texto
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		
	     writer.println("<h1>Livro enviado com sucesso</h1>");
	     
	     String nome = req.getParameter("nome");
	     String autor = req.getParameter("autor");
	     String isbn = req.getParameter("isbn");
	     String valor = req.getParameter("valor");
	     String data = req.getParameter("data");
	     
	     writer.println("<ul>");
	     writer.println("<li>nome: " + nome + "</li>");
	     writer.println("<li>autor: " + autor + "</li>");
	     writer.println("<li>isbn: " + isbn + "</li>");
	     writer.println("<li>valor: " + valor + "</li>");
	     writer.println("<li>data: " + data + "</li>");
	     writer.println("</ul>");
	}
 
}