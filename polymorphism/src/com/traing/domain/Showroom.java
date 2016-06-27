package com.traing.domain;
import com.traing.ifaces.Automobile;
public class Showroom {
	
	
	public Automobile getmodel(int key)
	{
		
		switch(key)
		{
		case 1: return new Maruticar();
		
		case 2: return new Toyotacar();
		
		default: return null;
		}
		
	}
	/**
	 * Method is used to print the quotation of vehicles
	 * @param polyauto
	 */
	public void printquote(Automobile polyauto)
	{
		
		System.out.println(Automobile.SHOWROOM_NAME);
		System.out.println(polyauto.getprice());
		System.out.println(polyauto.getcolor());
		System.out.println(polyauto.getmodel());
	}

}
