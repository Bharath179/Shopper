package com.instagram.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib {

	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/data.property");
		Properties property=new Properties();
		property.load(fis);
		String data = property.getProperty(key);
		return data;
		
	}
}
