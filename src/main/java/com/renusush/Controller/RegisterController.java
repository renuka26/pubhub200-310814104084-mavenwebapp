package com.renusush.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.renusush.Dao.Dao;
import com.renusush.model.Book;

/**
 * Servlet implementation class RegisterController
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Register Controller-> doPost ");

		//GEt the form data
		String name = request.getParameter("name");
		String emailId = request.getParameter("email_id");
		String userPassWord = request.getParameter("user_password");
		
		HttpSession session=request.getSession();session.setAttribute("REGISTERED_USER", name);
		Book user = new Book();
		user.setName(name);
		user.setEmailId(emailId);
		user.setPassword(userPassWord);
		
		
		System.out.println(user);
		
		//Call dao insert
		Dao dao = new Dao();
		dao.save(user);
		
		
		response.sendRedirect("Registersuccess.jsp");
	}

}
