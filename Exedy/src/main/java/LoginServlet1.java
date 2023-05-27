

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet1
 */
@WebServlet("/LoginServlet1")
public class LoginServlet1 extends HttpServlet {
	  private static final long serialVersionUID = 1L;

	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");

	    LoginModel loginModel = new LoginModel(username, password);
	    LoginDao loginDao = new LoginDao();

	    if (loginDao.validateLogin(loginModel)) {
	      request.setAttribute("username", username);
	      RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
	      dispatcher.forward(request, response);
	    } else {
	      RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
	      dispatcher.forward(request, response);
	    }
	  }
	}
