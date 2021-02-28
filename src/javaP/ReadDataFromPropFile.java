package javaP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropFile {
	
	@Test
	public void readDataPropFile() throws Exception {
		//File path
		//File class Object
		//Reading Data - FileInputStream - Class
		//Write Data - FileOutputStream - Class
		
		String filePath = System.getProperty("user.dir") + "//testData//data.properties";
		System.out.println("File path is = " + filePath);
		
		File file = new File(filePath);
		
		FileInputStream fIP = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fIP);
		
		String nameValue = prop.getProperty("name");
		System.out.println(nameValue);
	}
}
