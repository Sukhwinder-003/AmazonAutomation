package utils;

import org.openqa.selenium.By;

public class Locators {
	
	public static By signInLink = By.xpath("//span[contains(text(),'Hello. Sign in')]");
	public static By username =  By.xpath("//input[@id='ap_email']");
	public static By contBttn =  By.xpath("//input[@id='continue']");
	public static By password = By.xpath("//input[@id='ap_password']");
	public static By loginbutton =By.xpath("//input[@id='signInSubmit']");
	public static By userNameafterLoggedin =By.xpath("//span[contains(text(),'Hello, sukhwinder')]");
	public static By incorrectPasswordMessage =By.xpath("//span[@class='a-list-item']");
	
	public static By searchTextfield =By.xpath("//input[@id='twotabsearchtextbox']");
	public static By firstElement =By.xpath("//div[@class = 'a-section aok-relative s-image-tall-aspect']//img[@data-image-index= '0']");
	public static By productDetail =By.xpath("//span[@id='productTitle']");
	public static By cartCount =By.xpath("//span[@id = 'nav-cart-count']");
	public static By addTOCartBTTN =By.xpath("//input[@id='add-to-cart-button']");
	public static By cartIcon =By.xpath("//a[@id='nav-cart']");
	public static By deletBttn =By.xpath("	//div[@class= 'a-row sc-action-links']//span[@class= 'a-size-small sc-action-delete']");

	public static By multiElement =By.xpath("//div[@class = 'a-section aok-relative s-image-square-aspect']//img[@data-image-index= '3']");

	
	

	
	
	

	

	
	

	
	
	
	
	
	

}
