package firstName;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framedemo1 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		WebElement inn=driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(inn); 
		// or driver.switchTo.frame(0);
		String text=driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		driver.switchTo().parentFrame();
		String text1=driver.findElement(By.xpath("//p[contains(text(),'height and width attributes')]")).getText();
		System.out.println(text1);
		
}
}

