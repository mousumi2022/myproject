package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	
	By textbox_search=By.name("q");
	By button_search=By.name("btnk");
	
	WebDriver driver=null;
	

	public GoogleSearchPageObject(WebDriver driver) {
		this.driver=driver;
	}



	



	public void settextvalue(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void clicksearchbutton() {
		driver.findElement(button_search).click();
	}







	
}
