 package com.tka.ECIService;

import java.util.List;

import com.tka.ECIDao.Dao;
import com.tka.ECIEntity.Candidate;

public class Service {
	public List<Candidate> getAllCandidateList() {
		System.out.println("we are inside Service");
		Dao dao = new Dao();
		List<Candidate> allcandidatelist =dao.getAllCandidateList();
		return allcandidatelist;
	}

}
