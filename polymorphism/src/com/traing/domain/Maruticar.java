package com.traing.domain;

import com.traing.ifaces.Automobile;

public class Maruticar implements Automobile {

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 700000.00D;
	
	}

	@Override
	public String getcolor() {
		// TODO Auto-generated method stub
		return "Silver";
	}

	@Override
	public String getmodel() {
		// TODO Auto-generated method stub
		return "Swift";
	}

}
