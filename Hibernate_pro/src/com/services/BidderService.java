package com.services;

import com.model.in.Bidder;

public interface BidderService {
	
	 public boolean login(String username, String password);

	 public String registration(Bidder bidder);
	
	
	

}
