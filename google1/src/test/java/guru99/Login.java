package guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Login{
	static WebDriver driver;
	
public static void launch() {
	//WebDriverManager.chromedriver().setup();//Server Invoked
			WebDriverManager.firefoxdriver().setup();
			//WebDriver driver=new ChromeDriver();
			
			
}
}
