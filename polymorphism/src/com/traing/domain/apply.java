package com.traing.domain;
import java.util.*;

import com.traing.ifaces.Automobile;

public class apply {
	
	
	public static void main(String[] args) {
		String ch="Y";
		
		
		Scanner sc= new Scanner (System.in);
		do{
		System.out.println("Enter 1 for maruti 2 for toyota 3 for Bike");
		
		int key = sc.nextInt();
		Showroom obj=new newshowroom();
		
		Automobile polyauto= obj.getmodel(key);
		if(polyauto==null)
		{
			System.out.println("invalid choice");
		}
		else{
		obj.printquote(polyauto);
		}
		System.out.println("y to continue n to exit");
		ch=sc.next();
		}while(ch.equalsIgnoreCase("y"));
		
		
		sc.close();
	}

}
