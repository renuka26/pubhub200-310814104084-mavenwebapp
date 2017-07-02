package com.renusush.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.renusush.Dao.Dao;
import com.renusush.model.Book;

/**
 * Servlet implementation class LoginController
 */

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("LoginController invoked");

		// Step 1: Get the form data
		String emailId = request.getParameter("email_id");
		String password = request.getParameter("user_password");
		System.out.println("email_id:" + emailId + ",userPasswor:" + password);

		// Step 2: Call dao
		Dao dao = new Dao();
		Book user = dao.validate(emailId, password);

		// Step 3: Check if user is valid
		if (user != null) {
			
			HttpSession session = request.getSession();
			session.setAttribute("LOGGED_IN_USER", emailId);
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.include(request, response);
		} else {PrintWriter out=response.getWriter();
			out.println("login successful"
					+ "");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
		}

}
