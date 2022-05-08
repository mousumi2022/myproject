package guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Util extends Login{
	static WebDriver driver;
	
public static void main(String[]args) {
		Login.launch();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement log=driver.findElement(By.xpath("//input[@name='uid']"));
		log.sendKeys("mngr400811");
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("ehAzane");
		
	    WebElement loginbut=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		loginbut.click();
		
		System.out.println(driver.getTitle());
		
	}


	    
	
	

}
