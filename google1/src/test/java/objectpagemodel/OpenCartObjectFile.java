package objectpagemodel;


	//package pom.utilPrograms;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	//import UsaUtilPom;

	public class OpenCartObjectFile extends UsaUtilPom{
	WebDriver driver = null;
	@FindBy(xpath="//label[text()='Female']")
	WebElement rad;
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement fname;
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lname;
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	WebElement dragdate;
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement dragmonth;
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	WebElement dragyear;
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	@FindBy(xpath="//input[@id='Company']")
	WebElement comp;

	public OpenCartObjectFile(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void dorad() {
		rad.click();
	}
	public void doFname(String value) {
		fname.sendKeys(value);
	}
	public void doLname(String value) {
		lname.sendKeys(value);
	}

	public void doDrag(String type,String value) {
		switch(type) {
		case "date":
			drag(dragdate,value);
			break;
		case "month":
			drag(dragmonth,value);
			break;
		
		case "year":
			drag(dragyear,value);
			break;	
		}
	}
	public void email(String value) {
		email.sendKeys(value);
	}
	public void comp(String value) {
		comp.sendKeys(value);
	}
	}


