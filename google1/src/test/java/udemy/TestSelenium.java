package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSelenium {
	public static void main(String[]args) {
		//String path=System.getProperty("user.dir");
		//System.out.println(path);
		//System.setProperty("webdriver.gecko.driver", path+"\\drivers\\Geckodriver\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
	   //WebDriver driver=new FirefoxDriver();
	  // driver.get("https://www.selenium.dev/");
	   
	   WebDriverManager.chromedriver().setup();
	   WebDriver dr=new ChromeDriver();
	   dr.get("https://www.google.com");
	   dr.findElement(By.name("q")).sendKeys("Selenium Course");
	   
	   //WebDriverManager.edgedriver().setup();
	   //WebDriver dr1=new EdgeDriver();
	   //dr1.get("https://www.facebook.com");
	   
   }
}
