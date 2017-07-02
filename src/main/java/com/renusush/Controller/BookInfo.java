package com.renusush.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.renusush.Dao.Dao;
import com.renusush.model.Book;

/**
 * Servlet implementation class BookInfo
 */
public class BookInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("Book information controller invoked");
		PrintWriter out=response.getWriter();
		out.println("Book information controller invoked");
		
		String bookname = request.getParameter("bookname");
		
		System.out.println("Entered bookname:  "+bookname);
		
		Dao dao = new Dao();
		com.renusush.model.BookInfo book1 = dao.BookInformation(bookname);
		out.println(book1);
		
		request.setAttribute("BOOK_DETAIL", book1);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("reqbukdet.jsp");
		dispatcher.forward(request, response);

	}

}
