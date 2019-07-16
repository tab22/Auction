package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
	private static Configuration configuration;
	 private static SessionFactory sessionFactory;

	 static {
	  configuration = new Configuration()
	    .configure("hibernate.cfg.xml");
	  sessionFactory = configuration.buildSessionFactory();
	 }

	 public static Session getSession() {
	  Session session = null;
	  if (sessionFactory != null) {
	   session = sessionFactory.openSession();
	  }
	  return session;
	 }
	}


