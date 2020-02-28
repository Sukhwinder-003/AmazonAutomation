package utils;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {

	static ConfigFileReader config = new ConfigFileReader();

	public static void verifyResults(String actualResult, int flag) {

		String expectedResult = config.getuserName();
		String invalidpasswrd = config.getpasswordMessage();

		if (flag == 0) {

			assertEquals(actualResult, expectedResult);
			// System.out.println(actualResult);

		} else if (flag == 1) {

			assertEquals(actualResult, invalidpasswrd);

			System.out.println(actualResult + "actualResultactualResultactualResultactualResult");

			System.out.println(invalidpasswrd + "invalidpasswrdinvalidpasswrdinvalidpasswrdinvalidpasswrd");

			System.out.println(actualResult);

		}
	}

	public static void list(WebDriver driver) {


		List<WebElement> listElement1 = driver.findElements(By.xpath("//input[@value='Delete']"));

		// System.out.println(listElement1);

		for (WebElement element : listElement1) {
			System.out.println(element.getText());
			element.click();

			break;

		}

	}

	public WebDriver login(WebDriver driver) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(config.getURL());
		driver.navigate().refresh();
		driver.findElement(Locators.signInLink).click();
		driver.findElement(Locators.username).sendKeys(config.getvalidUsername());
		driver.findElement(Locators.contBttn).click();
		driver.findElement(Locators.password).sendKeys(config.getvalidPassword());
		driver.findElement(Locators.loginbutton).click();
		
		return driver;
	}

}
