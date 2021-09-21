package fr.eni.spring;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@WebServlet("/mess")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    @Autowired
    private Message message;

    @Override
    public void init(ServletConfig config) throws ServletException {
    	SpringBeanAutowiringSupport
    	.processInjectionBasedOnServletContext(this, config.getServletContext());
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<html><body><h1>" + message.getMsg() + "</html></body></h1>");
		
	}

}
