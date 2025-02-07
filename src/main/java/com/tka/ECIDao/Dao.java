package com.tka.ECIDao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tka.ECIEntity.Candidate;

public class Dao {

	public List<Candidate> getAllCandidateList() {
		System.out.println("we are inside Dao");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernatemysql.cfg.xml");
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		// Select * from Candidate
		Criteria criteria = session.createCriteria(Candidate.class);
		List<Candidate> listofcandidates = criteria.list();
		
		return listofcandidates;
	}
	

}
