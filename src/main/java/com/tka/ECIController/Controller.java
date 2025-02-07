 package com.tka.ECIController;

import java.util.List;

import com.tka.ECIEntity.Candidate;
import com.tka.ECIService.Service;

public class Controller {

	public List<Candidate> getAllCandidateList() {
		System.out.println("we are inside controller");
		Service service = new Service();
		List<Candidate> allcandidatelist = service.getAllCandidateList();
		return allcandidatelist;
	}

}
