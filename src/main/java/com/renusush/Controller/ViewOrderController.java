package com.renusush.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.renusush.Dao.Dao;
import com.renusush.model.Myorders;

/**
 * Servlet implementation class ViewOrderController
 */
public class ViewOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewOrderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		out.println("view controller invoked");
		
		Dao dao = new Dao();//String emailID="minney@gmail.com";String prodname="c";int quantity=456;
		List<Myorders> orders=dao.findAllOrders();
		

		HttpSession session=request.getSession();
				session.setAttribute("ORDER_DETAIL", orders);
		//out.println(session.getAttribute("ORDER_DETAIL"));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("vieworders.jsp");
		dispatcher.include(request, response);
		
	}

}
