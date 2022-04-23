package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clickcheckbox {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        selectcheckbox("Garry.White");
        selectcheckbox("Joe.Root");
        selectcheckbox("John.Smith");
        
      //a[text()='Garry.White']//parent::td//following-sibling::td[3]
	}
public static void selectcheckbox(String name) {
	driver.findElement(By.xpath("//a[text()='"+ name +"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	
	//driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
}
}
