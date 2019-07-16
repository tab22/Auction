package com.services;

import com.dao.in.BidderDao;
import com.dao.in.BidderDaoImpl;
import com.model.in.Bidder;

public class BidderServiceImpl  implements BidderService{

	 private BidderDao bidderDao = new BidderDaoImpl();
	@Override
	public boolean login(String username, String password) {
	
			  return bidderDao.login(username, password);
	}

	@Override
	public String registration(Bidder bidder) {
		return bidderDao.register(bidder);
	}

	
	
	
	
	
}
