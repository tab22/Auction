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
		public int insert(Bidder e) {
			
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
				HibernateUtil.closeSessionFactory();
			}
			return id;

			
		}

		
	}


