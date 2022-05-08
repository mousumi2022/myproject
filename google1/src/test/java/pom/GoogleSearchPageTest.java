package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import GoogleSearchPageObject.java

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPageTest {
	
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		googlesearch();
	}
	
  public static void googlesearch() 
 {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	
	GoogleSearchPageObject searchobj=new GoogleSearchPageObject(driver);
	
	driver.get("https://www.google.com/");
	
	//searchobj.settextvalue("ABC videos");
	searchobj.clicksearchbutton();
	
}
}
