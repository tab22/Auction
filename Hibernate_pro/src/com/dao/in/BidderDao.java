package com.dao.in;

import com.model.in.*;

public interface BidderDao {
	 public boolean login(String username, String password);

	 public String register(Bidder e);

}
