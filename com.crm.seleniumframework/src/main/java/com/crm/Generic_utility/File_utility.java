package com.crm.Generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class File_utility {
	
	/*
	* This method is used to launch application
	* @param Key
	* @return
	* @throws IOException
	* @author Vishwa
	* */ 
	
	
	public String getPropertyKeyValue1(String Key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(Key);
		return value;
		
	}

}
