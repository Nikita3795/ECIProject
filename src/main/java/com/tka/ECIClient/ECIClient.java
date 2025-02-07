 package com.tka.ECIClient;

import java.util.List;

import com.tka.ECIController.Controller;
import com.tka.ECIEntity.Candidate;

public class ECIClient {

	public static void main(String[] args) {
		System.out.println("we are in client layer");
		Controller controller = new Controller();
			List<Candidate> allcandidatelist = controller.getAllCandidateList();
			
			for (Candidate candidate : allcandidatelist) {
				System.out.println(candidate);
			}
			String partyname = "";
//			List<Candidate> allcandidatelist = controller.getCandidateListbyPartyName(partyname);
//			List<Candidate> allcandidatelist = controller.getAllCandidateage60List();
//			List<Candidate> allbjpcandidatelist = controller.getAllBJPCandidateList();
//			List<Candidate> allbjpcandidatelist = controller.getAllNCPCandidateList();
//			List<Candidate> allbjpcandidatelist = controller.getAllmaleCandidateList();
//			List<Candidate> allbjpcandidatelist = controller.getAllfemaleCandidateList();
//			List<Candidate> allbjpcandidatelist = controller.getAllindependentCandidateList();
	}

}
