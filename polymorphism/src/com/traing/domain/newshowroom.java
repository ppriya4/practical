package com.traing.domain;

import com.traing.ifaces.Automobile;

public class newshowroom extends Showroom  {

	@Override
	public Automobile getmodel(int key) {
		// TODO Auto-generated method stub
		if(key==3)
		{
			return new Bike();
		}
		else{
		return super.getmodel(key);
		}
	}

	
	

}
