package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private static Properties properties;
	private final String propertyFilePath= "C:/Users/sssaini/workspace/Amazon/configs/Configuartion.properties";

	
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getURL(){
		String url = properties.getProperty("amazonURL");
		if(url!= null) return url;
		else throw new RuntimeException("url is  not specified in the Configuration.properties file.");		
	}
	
	
	public String getvalidUsername(){
		String Username = properties.getProperty("validUsername");
		if(Username!= null) 
			return Username;
		else throw new RuntimeException("Username is  not specified in the Configuration.properties file.");		
	}
	
	
	public String getvalidPassword(){
		String Password = properties.getProperty("validPassword");
		if(Password!= null)
			return Password;
		else throw new RuntimeException("Password is  not specified in the Configuration.properties file.");		
	}
	
	
	
	public String getuserName(){
		String userName = properties.getProperty("userName");
		if(userName!= null)
			return userName;
		else throw new RuntimeException("userName is  not specified in the Configuration.properties file.");		
	}
	
	
	public String geInvalidpassword(){
		String password = properties.getProperty("invalidPassword");
		if(password!= null)
			return password;
		else throw new RuntimeException("password is  not specified in the Configuration.properties file.");		
	}
	
	
	
	public String getpasswordMessage(){
		String password = properties.getProperty("IncorrectPasswordMessage");
		if(password!= null)
			return password;
		else throw new RuntimeException("password is  not specified in the Configuration.properties file.");		
	}
	
	
	
	public String getSearchItem(){
		String Search = properties.getProperty("Search");
		if(Search!= null)
			return Search;
		else throw new RuntimeException("Search is  not specified in the Configuration.properties file.");		
	}
	
	public String firstProduct(){
		String SecondProduct = properties.getProperty("MultiItem1");
		if(SecondProduct != null)
			return SecondProduct;
		else throw new RuntimeException("SecondProduct  is  not specified in the Configuration.properties file.");		
	}
	
	
	
	
	public String getSecondProduct(){
		String SecondProduct = properties.getProperty("MultiItem2");
		if(SecondProduct != null)
			return SecondProduct;
		else throw new RuntimeException("SecondProduct  is  not specified in the Configuration.properties file.");		
	}
	
	
	public String getThirdProduct(){
		String ThirdProduct = properties.getProperty("MultiItem3");
		if(ThirdProduct != null)
			return ThirdProduct;
		else throw new RuntimeException("ThirdProduct  is  not specified in the Configuration.properties file.");		
	}
	
	
	
	
	
	public String getzevoURL(){
		String url = properties.getProperty("getzevoURL");
		if(url!= null) return url;
		else throw new RuntimeException("url is  not specified in the Configuration.properties file.");		
	}
	
	
		
	public String getZLUserName(){
		String url = properties.getProperty("getZLUserName");
		if(url!= null) return url;
		else throw new RuntimeException("url is  not specified in the Configuration.properties file.");		
	}
	
	
	
	public String getZLUserPassword(){
		String url = properties.getProperty("getZLUserPassword");
		if(url!= null) return url;
		else throw new RuntimeException("url is  not specified in the Configuration.properties file.");		
	}
	
	
	

		
			
	
	
}