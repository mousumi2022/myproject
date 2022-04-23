package newObjectPageModelProperty;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Old4Page extends UtilityFile4{
	WebDriver driver;

	@FindBy(xpath = "//label[text()='Female']")
	WebElement rd;
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement fn;
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement ln;
	@FindBy(xpath = "//select[@name='DateOfBirthDay']")
	WebElement drdate;
	@FindBy(xpath = "//select[@name='DateOfBirthMonth']")
	WebElement drmonth;
	@FindBy(xpath = "//select[@name='DateOfBirthYear']")
	WebElement dryear;
	
	

	public Old4Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void doradio() {
		
		Assert.assertEquals(true, doClick(rd));
		
	}

	public void dofnam(String value) {
		
		
		Assert.assertEquals(true, doSendKeys(fn,value));
	}

	public void dolnam(String value) {
		
		Assert.assertEquals(true,doSendKeys(ln,value)); 
	}
    public void doDrag(String value) {
		
		Assert.assertEquals(true,drop(drdate,value)); 
	}
public void doDrag1(String value) {
		
		Assert.assertEquals(true,drop(drmonth,value)); 
	}
public void doDrag2(String value) {
	
	Assert.assertEquals(true,drop(dryear,value)); 
}


	/*public void doDrag(String type, String value) {
		switch(type) {
		case "date" :
			Assert.assertEquals(true,drop(drdate,value));
		case "month" :
			drop(drmonth, value);
		case "year" :
			
	}
	}*/

}
