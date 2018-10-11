


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = "/LoginServlet", initParams = {@WebInitParam(name= "defaultUsername", value= "Nieznajomy")})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	}


