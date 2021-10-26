package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import dao.User;

import org.hibernate.Session;

import com.service.Service;

import entity.User;
import util.HibernateX;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
		out.println("Try Again!<br/>");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String newpass = request.getParameter("newpassword");
    	String repass = request.getParameter("repassword");
    	String username = request.getParameter("username");
    	String firstname = request.getParameter("firstname");
    	String lastname = request.getParameter("lastname");
    	Service service=new Service();
    	int user_flag = 0;
    	int pass_flag = 0;
    	
    	response.setContentType("text/html");
    	Session session=HibernateX.getsession();
    	int x=service.validateUser(username, newpass);
    	//Validations
    	if(!newpass.equals((String)repass))
    		pass_flag++;
    	if(x==1) {	
    		response.setContentType("text/html");
	    	PrintWriter out=response.getWriter();
			RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
			out.println("Username already exists!<br/>");
			rd.include(request, response);
			
    	}
    	else if(pass_flag>0) {
    		response.setContentType("text/html");
    		PrintWriter out=response.getWriter();
    		RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
    		out.println("Password didn't match!<br/>");
    		rd.include(request, response);
    	}
    	else {
    		service.signUp(newpass,repass,username,firstname,lastname);
			PrintWriter out=response.getWriter();
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			out.println("User added succesfully!<br/>");
			rd.include(request, response);
    	}
    	
	}

}
