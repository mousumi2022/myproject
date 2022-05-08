package udemy;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
	private static WebDriver driver=null;
	public static void main(String[] args) {
		
		search();
		
	}
public static void search(){
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Steps to create gmail account");
	GoogleSearchPage.search_Text(driver).sendKeys("Steps to Automate your code");
	
	//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	GoogleSearchPage.search_button(driver).sendKeys(Keys.RETURN);
	driver.close();
	
}
}
