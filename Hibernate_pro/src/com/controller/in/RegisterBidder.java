package com.controller.in;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.in.BidderDao;
import com.dao.in.BidderDaoImpl;
import com.model.in.Bidder;

@WebServlet("/RegisterBidder")
public class RegisterBidder extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegisterBidder() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String msg = "Password and Conform Passwords must be same";
		  String page = "userRegistration.jsp";
		  if(request.getParameter("password").equals(request.getParameter("confPassword"))){
		   Bidder bidder = new Bidder();
		   bidder.setName(request.getParameter("name"));
		   bidder.setEmail(request.getParameter("email"));
		   bidder.setDob(request.getParameter("dob"));
		   bidder.setGender(request.getParameter("gender"));
		   bidder.setAddress(request.getParameter("address"));
		   bidder.setPassword(request.getParameter("password"));
		   bidder.setMobile(request.getParameter("mobile"));
 
		  
		  
		   
		   System.out.println(bidder.toString());
		   BidderDao bidderDao = new BidderDaoImpl();
		   msg = bidderDao.register(bidder);
		   page = "login.jsp";
		  } 
		  request.setAttribute("msg2", msg);
		  request.getRequestDispatcher(page).include(request, response);
		 }
		
		
		
		
		
		
		
		
	}


