package sarava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vrishin1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium04\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://www.google.co.in");
		  driver.close();

	}

}
