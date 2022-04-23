package alert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertProg {
	static WebDriver driver ;
	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(e).perform();
		
		List<WebElement> ls=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//span"));
		for(WebElement e1: ls) {
			String txt=e1.getText();
			System.out.println(txt);
			if(txt.equals("Copy")) {
				e1.click();
			}
		}
		
}
}

