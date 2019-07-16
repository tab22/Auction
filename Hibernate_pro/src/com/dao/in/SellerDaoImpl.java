package com.dao.in;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.in.Seller;
import com.util.HibernateUtil;

public class SellerDaoImpl implements SellerDao {


	
	@Override
	public int insert(Seller e) {
		Session session = null;;
		Transaction tx = null;
		int id=1;
		try {
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			 session.save(e);
			System.out.println("Record Id "+id);
			tx.commit();
		} catch (HibernateException h) {
			System.out.println(h);
		} finally {
			//session.close();
			
		}
		return id;

	}

}
