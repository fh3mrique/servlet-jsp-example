package hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Configurar o tipo de conteúdo da resposta como HTML
	    response.setContentType("text/html");
	    
	    // Obter o objeto PrintWriter para escrever a resposta
	    PrintWriter pw = response.getWriter();

	    // Escrever o conteúdo HTML na resposta
	    pw.println("<!DOCTYPE html>");
	    pw.println("<html>");
	    pw.println("<head>");
	    pw.println("<title>Minha Página Gerada por Servlet</title>");
	    pw.println("<style>");
	    pw.println("body { font-family: Arial, sans-serif; text-align: center; margin-top: 50px; }");
	    pw.println("h1 { color: #007BFF; }");
	    pw.println("</style>");
	    pw.println("</head>");
	    pw.println("<body>");
	    pw.println("<h1>Bem-vindo à Página Gerada pelo Servlet!</h1>");
	    pw.println("<p>Esta página foi gerada dinamicamente usando Java Servlets.</p>");
	    pw.println("<a href='/'>Voltar para a página inicial</a>");
	    pw.println("</body>");
	    pw.println("</html>");

	    // Fechar o PrintWriter
	    pw.close();
		
	}

}
