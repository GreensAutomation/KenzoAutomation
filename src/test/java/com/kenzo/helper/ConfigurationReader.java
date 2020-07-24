package com.kenzo.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;

	public ConfigurationReader() throws IOException {
		File f = new File(
				"C:\\Users\\Vigneshwari\\eclipse-workspace\\KenzoAutomation\\src\\test\\java\\com\\kenzo\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getBroswerName() {
		String broswerName=p.getProperty("broswerName");
		return broswerName;
	}
	
	public String getUrl() {
		String url=p.getProperty("url");
		return url;

	}
	
	
}
