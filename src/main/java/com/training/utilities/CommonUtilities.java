package com.training.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {
	
	public String getproperty(String key)  {
		String spath="C:\\Users\\hellojuly\\eclipse-workspace\\TestNGframework1\\properties\\application.properties";
		FileInputStream fileinput = null;
		try {
			fileinput = new FileInputStream(spath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties property=new Properties();
		try {
			property.load(fileinput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=property.getProperty(key);
		return value;
		
	}

}
