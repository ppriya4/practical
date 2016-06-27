package com.traing.domain;

import com.traing.ifaces.Automobile;

public class Toyotacar implements Automobile {

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 12000000.00D;
	}

	@Override
	public String getcolor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public String getmodel() {
		// TODO Auto-generated method stub
		return "Innova";
	}

}
