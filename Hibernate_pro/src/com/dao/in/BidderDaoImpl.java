package com.dao.in;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.util.*;
import com.model.in.*;

public class BidderDaoImpl implements BidderDao {
	@Override
	 public boolean login(String username, String password) {
	  Session session = HibernateUtil.getSession();
	  if (session != null) {
	   try {
	    Bidder bidder = (Bidder) session.get(Bidder.class, username);
	    if (password.equals(bidder.getPassword())) {
	     System.out.println("User: " + bidder.toString());
	     return true;
	    }
	   } catch (Exception exception) {
	    System.out.println("Exception occred while reading user data: "
	      + exception.getMessage());
	    return false;
	   }

	  } else {
	   System.out.println("DB server down.....");
	  }
	  return false;
	 }

	 @Override
	 public String register(Bidder bidder) {
	  String msg = "Registration unsuccessful, try again.....";
	  Session session = HibernateUtil.getSession();
	  if (session != null) {
	   try {
	    if (bidder != null) {
	     String username = (String) session.save(bidder);
	     session.beginTransaction().commit();
	     msg = "Bidder" + username
	       + " created successfully, please login...";
	    }
	   } catch (Exception exception) {
	    System.out.println("Exception occred while reading user data: "
	      + exception.getMessage());
	   }

	  } else {
	   System.out.println("DB server down.....");
	  }
	  System.out.println("msg:" + msg);
	  return msg;
	 }
	}