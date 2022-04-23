package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class select {
	//public class WebTablefromLeft {
		static WebDriver driver ;
		public static void main(String [] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://selectorshub.com/xpath-practice-page/");
			driver.manage().window().maximize();
			selectUsernameCheckbox("Joe.Root");
			selectUsernameCheckbox("John.Smith");
			
			
	}
		
		public static void selectUsernameCheckbox(String name) {
			driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		}
	}

