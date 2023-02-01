package com.crm.Generic_utility;

import java.util.Random;

public class Java_utility {
	
	/*
	* This method is used to launch application
	* @return
	* * @author Vishwa
	* */ 
	
	public int getRanDomNum() 
	{
		Random ran=new Random();
		int RanNum = ran.nextInt(1000);
		return RanNum ;
		
	}

}
