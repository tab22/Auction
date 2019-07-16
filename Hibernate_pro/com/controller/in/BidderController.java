package com.controller.in;

import java.io.IOException;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet("/BidderController")
	public class   BidderController extends HttpServlet {
		private static final long serialVersionUID = 1L;
	    public BidderController() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String m_option=request.getParameter("option");
	        String url=null;
	        
	        if(m_option.equals("insert")){
	       	 
	       	 url="InsertBidder.html";
	        }
	        
	        RequestDispatcher rd=request.getRequestDispatcher(url);
	        rd.forward(request, response);
	}



	}


