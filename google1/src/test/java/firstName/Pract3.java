package firstName;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pract3 {
	
		static WebDriver driver ;
		public static void main(String [] args) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://www.freshworks.com/");
			driver.manage().window().maximize(); 
			List<WebElement> ls=driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]/li/a"));
			for(WebElement e:ls) {
				String text=e.getText();
				System.out.println(text);
				if(text.equalsIgnoreCase("Freshservice")) {
					e.click();
					break;
				}
			}
		   
	}
}
