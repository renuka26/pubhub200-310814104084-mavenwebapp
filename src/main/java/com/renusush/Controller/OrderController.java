package com.renusush.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.renusush.Dao.Dao;
import com.renusush.model.Book;

/**
 * Servlet implementation class OrderController
 */
public class OrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderController() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out=out.println("Order Controller invoked");
		
		PrintWriter out=response.getWriter();
		out.println("Order controller invoked");
		
		String quantity = request.getParameter("qty");
		String prodname = request.getParameter("pname");
		
HttpSession	session=request.getSession();
Object name=session.getAttribute("LOGGED_IN_USER");

		System.out.println("entered qty:" + quantity+prodname);Book user = new Book();
		//user.setEmailId(getServletInfo());
		Dao dao = new Dao();
		dao.placeorder(quantity,name, prodname);
		
		response.sendRedirect("myorders.jsp");
	}

}
