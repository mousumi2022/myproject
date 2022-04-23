package firstName;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pract2 {
	static WebDriver driver ;
	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.manage().window().maximize(); 
		WebElement drop=driver.findElement(By.xpath("//select[@name='Country']"));
		Select s = new Select(drop);
	   List<WebElement>  ls = s.getOptions();
	   for(WebElement name:ls) {
		   String text=name.getText();
		   System.out.println(text);
		   if(text.equals("Aruba")) {
			   name.click();
			   break;
		   }
	   }
}
}

